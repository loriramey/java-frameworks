package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class InventoryValidator implements ConstraintValidator <ValidInventory, Part> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if (context == null) return true;
        if (context != null) myContext = context;
        if (part == null) {
            return false;
        } else if (part.getInv() < part.getMinInv()) {
           constraintValidatorContext.disableDefaultConstraintViolation();
           constraintValidatorContext.buildConstraintViolationWithTemplate("Insufficient inventory for part: " + part.getName()).addConstraintViolation();
           return false;
        } else if (part.getInv() > part.getMaxInv()) {
           constraintValidatorContext.disableDefaultConstraintViolation();
           constraintValidatorContext.buildConstraintViolationWithTemplate("Too much inventory for part: " + part.getName()).addConstraintViolation();
           return false;
        }

        return true;
    }
}