package com.example.demo.domain;

import com.example.demo.validators.ValidMaximum;
import com.example.demo.validators.ValidMinimum;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Entity
@ValidMinimum
@ValidMaximum
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="part_type",discriminatorType = DiscriminatorType.INTEGER)

@Table(name="Parts")
public abstract class Part implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    @Min(value = 0, message = "Price value must be positive")
    double price;
    @Min(value = 0, message = "Inventory value must be positive")
    int inv;
    @Min(value = 0, message = "Minimum inventory value must be positive")
    int minInv;
    @Min(value = 0, message = "Maximum inventory must be positive")
    @Max(value = 200, message = "Maximum inventory value must fall within set maximum")
    int maxInv;

    @ManyToMany
    @JoinTable(name="product_part", joinColumns = @JoinColumn(name="part_id"),
            inverseJoinColumns=@JoinColumn(name="product_id"))
    Set<Product> products= new HashSet<>();

    public Part() {
    }

    public Part(String name, double price, int inv) {
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInv = 0; //default minimum inventory = 0;
        this.maxInv = 100; //default minimum inventory = 100;
    }

    public Part(long id, String name, double price, int inv, int minInv, int maxInv) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInv = minInv;  //setting default value
        this.maxInv = maxInv; //setting default value
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInv() {
        return inv;
    }

    public void setInv(int inv) {
        this.inv = inv;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public int getMinInv() {
        return minInv;
    }

    public void setMinInv(int minInv) {
        this.minInv = minInv;
    }

    public int getMaxInv() {
        return maxInv;
    }

    public void setMaxInv(int maxInv) { this.maxInv = maxInv; }

    public String toString(){
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part = (Part) o;

        return id == part.id;
    }

    public void validateLimits() {
        if (this.inv < this.minInv) {
            throw new RuntimeException("This value falls below required minimum.");
        } else if (this.inv > this.maxInv) {
            throw new RuntimeException("This value exceeds the allowed maximum.");
        }
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
