## D287 JAVA FRAMEWORKS: Read Me
**Scenario**: You are working for a company that licenses and customizes a software application to keep track of inventory in stores. Your job as a software developer is to customize this application to meet a specific customer’s needs. 

For my project, I have designed a fictional company based on a small business owned by a friend of mine. She sells homemade sweet snacks like hand-decorated chocolate pretzels, tasty rice crispy treats, or hand-dipped and decorated Oreos. She assembles a variety of sweets into fun boxes that she can sell as combo packs around particular holidays or events (like football season). I'm proud of her hard work to build her business, so I dedicate this project to her.
### TASK INSTRUCTIONS PROVIDED FOR REFERENCE
Each note should include the prompt, file name, line number, and change.

## TRACKED CHANGES
**C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.**

_filename: mainscreen.html_

lines 14-114 ADDED for CSS styling of page (background color, etc.)
```
    <!-- CSS Styling -->
    <style>
        .header-image {
            display: block;
            margin-left: auto;
            margin-right: auto;
            width: 100%;
        }

        body {
            margin: 0;
            padding: 0;
            color: #800080;
            background-color: #d8bfd8;
            font-family: "Gill Sans", Helvetica, Arial, sans-serif;
            font-size: 1em;
            line-height: 1.2;
        }

        h1 {
            margin: 0;
            margin-top: 0.67em;
            font-weight: bold;
            font-size: 1.8em;
            line-height: 1;
        }

        h2 {
            margin: 0 0 1em;
        }

        p {
            margin: 1em 0 1.5em;
            line-height: 1.5;
        }

        a:link {
            color: blue;
            background-color: transparent;
        }

        a:visited {
            color: purple;
            background-color: transparent;
        }

        a:focus {
            color: #fff;
            background-color: #000;
            outline: 0;
        }

        a:active {
            color: red;
            background-color: transparent;
        }

        .container {
            margin: 0 auto;
            max-width: 60em;
            background: #fff;
        }

        .header-primary {
            background:#ccc;
            padding: 20px;
        }

        .navigation-primary {
            background-color: #666;
        }

        .navigation-primary ul {
            margin: 0;
            padding: 0;
            list-style-type: none;
            overflow: hidden;
        }

        .navigation-primary li {
            display: inline;
        }

        .navigation-primary a {
            float: left;
            padding: .5em 1em;
            color: #fff;
            background: #666;
            text-decoration: none;
            border-right: 1px solid #fff;
        }

        .navigation-primary a:hover {
            background: green;
        }

        .navigation-primary a:focus {
            background: #000;
            outline: none;
        }

        .navigation-primary a:active {
            background: red;
        }

        .content-container {
            padding: 2em;
            background: #fff;
        }

        .footer-primary {
            background-color: #4B0082;
            color: #fff;
            padding: 20px;
        }
    </style>

```

line 117: changed shop name to Cary's Confections (original file line 14)

```
<title>Cary's Confections</title>

```

line 123: added a header image to the page

```
<img src="/images/header_img.jpg" alt="Cupcakes Header Image" class="header-image">
<h1>Cary's Confections</h1>
<hr>
<a href="/about" class="btn btn-info">About Cary's Confections</a>

```

line 124: changed display header to "Cary's Confections" (original file line 19)

line 128: changed header for "Parts" to "Individual Sweets" (original line 21)

line 164: changed header for "Products" to "Snack Boxes" (originally line 53)

lines 203-205: ADDED footer to page with business name & copyright date

```
<footer class="footer-primary">
    Copyright &copy; Cary's Confections, 2024
</footer>

```

*******************

**D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers 
and include navigation to and from the “About” page and the main screen.**

_filename: mainscreen.html_

line 126: added a Button linked to the About Me page, just below page title

```
<a href="/about" class="btn btn-info">About Cary's Confections</a>
```

_filename: MainScreenController.java_

lines 56-57: added controller @GetMapping to enable access to About page.
```
@GetMapping("/about")
public String about() { return "about.html"; }
```

_filename: about.html_

lines 1 - 149: added new About.html page with HTML layout and styling copied from mainscreen's styling.

```
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="UTF-8">

  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

  <!-- CSS Styling -->
  <style>
    .header-image {
      display: block;
      margin-left: auto;
      margin-right: auto;
      width: 100%;
    }

    body {
      margin: 0;
      padding: 0;
      color: #800080;
      background-color: #d8bfd8;
      font-family: "Gill Sans", Helvetica, Arial, sans-serif;
      font-size: 1em;
      line-height: 1.2;
    }

    h1 {
      margin: 0;
      margin-top: 0.67em;
      font-weight: bold;
      font-size: 1.8em;
      line-height: 1;
    }

    h2 {
      margin: 0 0 1em;
    }

    p {
      margin: 1em 0 1.5em;
      line-height: 1.5;
    }

    a:link {
      color: blue;
      background-color: transparent;
    }

    a:visited {
      color: purple;
      background-color: transparent;
    }

    a:focus {
      color: #fff;
      background-color: #000;
      outline: 0;
    }

    a:active {
      color: red;
      background-color: transparent;
    }

    .container {
      margin: 0 auto;
      max-width: 60em;
      background: #fff;
    }

      .navigation-primary ul {
      margin: 0;
      padding: 0;
      list-style-type: none;
      overflow: hidden;
    }

    .navigation-primary li {
      display: inline;
    }

    .navigation-primary a {
      float: left;
      padding: .5em 1em;
      color: #fff;
      background: #666;
      text-decoration: none;
      border-right: 1px solid #fff;
    }

    .navigation-primary a:hover {
      background: green;
    }

    .navigation-primary a:focus {
      background: #000;
      outline: none;
    }

    .navigation-primary a:active {
      background: red;
    }

    .footer-primary {
      background-color: #4B0082;
      color: #fff;
      padding: 20px;
    }
  </style>

  <title>About Cary's Confections</title>
</head>

<body>

<div class="container">
  <img src="/images/about_head.jpg" alt="Cereal Bars Header Image" class="header-image">

  <h1>About Cary's Confections</h1>
  <a href="/mainscreen" class="btn btn-info">Go Back Home</a>

  <hr>
  <h2>My Story</h2>
  <p>I founded Cary's Confections in 2023 to meet a need at my workplace for excellent, homemade snacks.
  My coworkers were languishing in the barren wastelands of store-bought sweets.
    I realized I could combine my love of chocolate and hand-decorating sweets
    and make BETTER snacks for parties and individual munching.
  </p>
  <hr>
  <h2>My Products</h2>
  <p>Everything at Cary's Confections is made personally by me, with love.
  You will find delicious chocolate-covered pretzels, a variety of hand-dipped and decorated Oreos,
  and seasonal offerings in our big snack boxes perfectly sized for events or home snacking!
  </p>
  <hr>
</div>

<footer class="footer-primary">
  Copyright &copy; Cary's Confections, 2024
</footer>

</body>
</html>

```

***********************

**E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts 
and five products in your sample inventory and should not overwrite existing data in the database.**

_filename: BootStrapData.java_

added code to public BootStrapData class to fill in part repository

lines 27-33 - insertion of new repo for inhouse parts
```
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;


    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, **InhousePartRepository inhousePartRepository,** OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inhousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

```
lines 43-139 - added 5 new parts to the repository: 2 in-house and 3 outsourced parts

```
@Override
    public void run(String... args) throws Exception {
        List<InhousePart> inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();

        InhousePart ip1 = new InhousePart();
        ip1.setId(901);
        ip1.setName("RC treat");
        ip1.setPrice(5.00);
        ip1.setInv(10);
        ip1.setMinInv(1);
        ip1.setMaxInv(100);
        inhousePartRepository.save(ip1);
        InhousePart thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("RC treat"))thePart=part;
        }

        InhousePart ip2 = new InhousePart();
        ip2.setId(905);
        ip2.setName("popcorn");
        ip2.setPrice(3.00);
        ip2.setInv(20);
        ip2.setMinInv(1);
        ip2.setMaxInv(100);
        inhousePartRepository.save(ip2);
        thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("popcorn"))thePart=part;
        }


        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            System.out.println(part.getName()+" "+part.getId());
        }


        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();

        OutsourcedPart op1= new OutsourcedPart();
        op1.setCompanyName("Wilson Baking Supplies");
        op1.setName("chocolate");
        op1.setInv(10);
        op1.setPrice(10.00);
        op1.setId(102L);
        op1.setMinInv(1);
        op1.setMaxInv(100);
        outsourcedPartRepository.save(op1);
        OutsourcedPart theOutPart=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("chocolate"))theOutPart=part;
        }

        System.out.println(theOutPart.getCompanyName());

        OutsourcedPart op2= new OutsourcedPart();
        op2.setCompanyName("Utz Snack Co");
        op2.setName("pretzels");
        op2.setInv(50);
        op2.setPrice(4.00);
        op2.setId(999L);
        op2.setMinInv(1);
        op2.setMaxInv(100);
        outsourcedPartRepository.save(op2);
        theOutPart=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("pretzels"))theOutPart=part;
        }

        System.out.println(theOutPart.getCompanyName());

        OutsourcedPart op5= new OutsourcedPart();
        op5.setCompanyName("Nabisco");
        op5.setName("oreo");
        op5.setInv(50);
        op5.setPrice(3.00);
        op5.setId(111L);
        op5.setMinInv(1);
        op5.setMaxInv(100);
        outsourcedPartRepository.save(op5);
        theOutPart=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("oreo"))theOutPart=part;
        }

        System.out.println(theOutPart.getCompanyName());

        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }
```
lines 141-151:  added 5 new products to product repository

```
        Product small_snack= new Product("Small Snack Pack",10.00,5);
        Product big_snack= new Product("Big Snack Pack",25.00,8);
        Product tailgate_pack= new Product("Tailgating Box",50.00,6);
        Product birthday_pack= new Product("Birthday Box",45.00,4);
        Product valentine_pack= new Product("Valentine Box",50.00,7);

        productRepository.save(small_snack);
        productRepository.save(big_snack);
        productRepository.save(tailgate_pack);
        productRepository.save(birthday_pack);
        productRepository.save(valentine_pack);

```

*****************************
**F.  Add a “Buy Now” button to your product list.** 

_filename: mainscreen.html_

Line 196: added this line to create Buy Now button next to Product Add/Delete interface 

```
<a th:href="@{/buyProduct(productID=${tempProduct.id})}" class="btn btn-primary btn-sm mb-3">Buy Now</a>

```

**3 NEW FILES CREATED**

NEW _filename: BuyProductController.java_

lines 1-44: new Controller for "Buy Product" button on mainscreen.html:
  
This code creates a **buyProduct** method to check whether the buyer's selection is currently in stock.
    if in stock, will return confirmation page that purchase was successful (confirmbuysuccessful.html)
    If out of stock or other error, return an error page so the customer knows (confirmbuyfailure.html)

```
package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class BuyProductController {
@Autowired
private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long theId, Model theModel) {
        Optional<Product> productToBuy = productRepository.findById(theId);

        if (productToBuy.isPresent()) {    //check if product in catalog
            Product product = productToBuy.get();

            if (product.getInv() > 0) {    //check if product still in stock
                product.setInv(product.getInv() - 1);   //decrement stock
                productRepository.save(product);    //save to product database

                return "/confirmbuysuccess";   //successful purchase
            } else {
                return "/confirmbuyfailure";   //purchase failed: out of stock
            }
        } else {
            return "/confirmbuyfailure";  //purchase failed: product not found
        }
    }
}
```

NEW _filename: confirmbuysuccess.html_ [in Templates folder]

lines 1-13: new code which displays "Your purchase was successful" and thanks in response to successful purchase of product.

```
<!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Purchase Successful</title>
    </head>
    <body>
        <h1>Your purchase was successful. We hope you enjoy your treats! Thanks for shopping with us!</h1>
        
        //<a href="http://localhost:8080/">Link
        to Main Screen</a>
    </body>
    </html>
```

NEW _filename: confirmbuyfailure.html_ [in Templates folder]

lines 1-13: new code which displays "Your purchase did not succeed. Product may be out of stock. Please try again or contact us for assistance."

```
<!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Failure to complete purchase</title>
        </head>
        <body>
            <h1>Your purchase did not succeed. Product may be out of stock. Please try again or contact us for assistance.</h1>
            
            <a href="http://localhost:8080/">Link
            to Main Screen</a>
        </body>
    </html>
```

*******************

**G.  Modify the parts to track maximum and minimum inventory**:

**•  Add additional fields to the part entity for maximum and minimum inventory.**

MODIFIED _filename: Part.java_

lines 39-43: inserted 2 new variables (minInv, maxInv) using @Min annotation for minInv and maxInv

```
    @Min(value = 0, message = "Minimum inventory value must be positive")
    int minInv;
    
    @Min(value = 0, message = "Maximum inventory must be positive")
    @Max(value = 100, message = "Maximum inventory value must fall within set maximum")
    int maxInv;

```

lines 57-58 and 66-67: added a default minimum inventory and max inventory values (0,100) to both default contructors

```
public Part(String name, double price, int inv) {
    this.name = name;
    this.price = price;
    this.inv = inv;
    this.minInv = 0; //default minimum inventory = 0;
    this.maxInv = 100; //default minimum inventory = 100;
}
```

lines 110-122: created 4 new getter and setter methods to get and set both minInv and maxInv

```
    public int getMinInv() { return minInv; }

    public void setMinInv(int minInv) { this.minInv = minInv }

    public int getMaxInv() { return maxInv; }

    public void setMaxInv(int maxInv) { this.maxInv = maxInv; }

```

_filename: InhousePart.java_

lines 18-19: added values for min & max inventory to make sure a default is set

```
    public InhousePart() {
        this.minInv = 0;
        this.maxInv = 100;
    }
```

_filename: OutsourcedPart.java_

lines 18-19: added values for min & max inventory to make sure a default is set

```
    public OutsourcedPart() {
        this.minInv = 0;
        this.maxInv = 100;
    }
```

**Additional Optional Change**

_filename: mainscreen.html_

lines 145-146: added table headers for Minimum Inventory and Maximum Inventory to display these in the table

```
        <tr>
            <th>Name</th>
            <th>Price</th>
            <th>Inventory</th>
            <th>Min Inv</th>
            <th>Max Inv</th>
            <th>Action</th>
        </tr>
```

Lines 155-156: added table rows (td) for min inv and max inv

```
        <td th:text="${tempPart.minInv}">1</td>
        <td th:text="${tempPart.maxInv}">1</td>
```

**•  Modify the sample inventory to include the maximum and minimum fields.**

_filename: BootStrapData.java_

Added this code to EACH of the 5 products (see full quoted code above for confirmation)

on lines 52-53, 66-67, 90-91, 107-108, 124-125, where [*] = the variable for that part:
```
    [*].setMinInv(1);
    [*].setMaxInv(100);
```


**•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs**

_filename: InhousePartForm.html_

lines 26-30: added 2 fields for entering minimum & maximum inventory thresholds to this form

```
    <p><input type="text" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
        <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Inventory Error</p>
    
    <p><input type="text" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"/></p>
        <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Inventory Error</p>

```

_filename: OutsourcedPartForm.html_

lines 28-32: added 2 entry fields to this web form to enable user to enter min & max inventory limits

```
    <p><input type="text" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
        <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Inventory Error</p>
    
    <p><input type="text" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"/></p>
        <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Inventory Error</p>

```

**•  Rename the file the persistent storage is saved to.**

MODIFY _filename: application.properties_

changed the location of the persistent database file to "candy-products-db"

```
spring.datasource.url=jdbc:h2:file:~/candy-products-db
```


**•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.**

Made changes to the following files to validate numbers entered for min / max inventory:

_filename: Part.java_

ADD lines 137-143: created **validateLimits()** method for Part class 

This new method ensures that no inventory value can fall below or rise above the set minimum/maximum values.

Further validators will be added in part H.

```
    public void validateLimits() {
        if (this.inv < this.minInv) {
            throw new RuntimeException("This value falls below required minimum.");
        } 
        else if (this.inv > this.maxInv) {
            throw new RuntimeException("This value exceeds the allowed maximum.");
        }
    }
```

_filename: PartServiceImpl.java

ADD line 59: call validateLimits method as part of the save method

```
    @Override
    public void save(InhousePart thePart) {
        thePart.validateLimits();
        partRepository.save(thePart);
    }
```

_filename: InhousePartServiceImpl.java_

ADD line 54: call validateLimits method as part of the save method

```
    @Override
    public void save(InhousePart thePart) {
        thePart.validateLimits();
        partRepository.save(thePart);
    }
```

_filename: OutsourcedPartServiceImpl.java_

ADD line 52: call validateLimits method as part of the save method

```
    @Override
    public void save(OutsourcedPart thePart) {
        **thePart.validateLimits();**
        partRepository.save(thePart);
    }
```

*****************************

**H.  Add validation between or at the maximum and minimum fields.**

**•  Display error messages for low inventory when adding and updating PARTS if the inventory is less than the minimum number of parts.**

**•  Display error messages for low inventory when adding and updating PRODUCTS lowers the part inventory below the minimum.**

New Validator for Minimum inventory: 

added custom error message for minimum inventory when updating parts which are used in products.
"Part count falls below set minimum"

2 NEW files:
_filename: ValidMinimum.java_ lines 1-23

```
package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {MinimumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinimum {
    String message() default "Part count falls below set minimum";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

```
_filename: MinimumValidator.java_   lines 1-31

```
package com.example.demo.validators;

import com.example.demo.domain.Part;
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
public class MinimumValidator implements ConstraintValidator<ValidMinimum, Part> {
    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidMinimum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() > part.getMinInv();
    }

}

```
MODIFING domain model class files to apply minimum validator

_filename: Part.java_   line 24

```
import.com.example.demo.validators.ValidMinimum;
...
line 25: @ValidMinimum
```

Edited vaidator for Products, _EnufPartsValidator_ to enforce minimum inventory:

MODIFY _filename: EnufPartsValidator.java_  (lines 35-39)

Edited to add validation logic to the isValid method to check for minimum inventory:

- added new logic to check for min value of remaining Parts when decrementing Product inventory for a purchase
- Added new error messages using ConstraintValidatorContext to provide custom error messages within **isValid** method
  "Insufficient inventory for part: [part name]"

```
public class EnufPartsValidator implements ConstraintValidator<ValidEnufParts, Product> {
 ...
 
    @Override
    public boolean isValid(Product product, ConstraintValidatorContext constraintValidatorContext) {
        if (context == null) return true;
        if (context != null) myContext = context;
        ProductService repo = myContext.getBean(ProductServiceImpl.class);
        if (product.getId() != 0) {
            Product myProduct = repo.findById((int) product.getId());
            for (Part p : myProduct.getParts()) {
                if (p.getInv() < (product.getInv() - myProduct.getInv())) {
                    constraintValidatorContext.disableDefaultConstraintViolation();
                    constraintValidatorContext.buildConstraintViolationWithTemplate("Insufficient inventory for part: " + p.getName()).addConstraintViolation();
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

```

MODIFY _filename: Product.java_

Add 2 lines of code to apply validator to Product classes

line 20 + import statement
```
import com.example.demo.validators.ValidEnufParts;
...
@ValidEnufParts

```

**•  Display error messages when adding and updating parts if the inventory is greater than the maximum.**

2 NEW files
_filename: ValidMaximum.java_ lines 1-25

```
package com.example.demo.validators;

import com.example.demo.validators.MaximumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {MaximumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMaximum {
    String message() default "Part count is above set maximum";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

```

_filename: MaximumValidator.java_ lines 1-31

```
package com.example.demo.validators;

import com.example.demo.domain.Part;
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
public class MaximumValidator implements ConstraintValidator<ValidMaximum, Part> {
    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidMaximum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() <= part.getMaxInv();
    }
}

```

MODIFING domain model class files to apply maximum validator

_filename: Part.java_  line 25

```
import.com.example.demo.validators.ValidMaximum;
...
line 25: @ValidMaximum
```

Ensure Error Messages will display on part and product forms

MODIFY _filename: InhousePartForm.html_  lines 34-38
MODIFY _filename: OutsourcedPartForm.html_    lines 36-40

to display error messages within the POST section of this HTML form

```
*lines 34-38 InhousePartForm

<div th:if="${#fields.hasErrors()}">
    <ul>
        <li th:each="err : ${#fields.allErrors()}" th:text="${err}" class="error"/>
    </ul>
</div>
    
    
*lines 36-40 OutsourcedPartForm

<div th:if="${#fields.hasErrors()}">
    <ul>
        <li th:each="err : ${#fields.allErrors()}" th:text="${err}" class="error"/>
    </ul>
</div>

```

*******************

**I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.**

MODIFY _filename: PartTest_

added code lines 160 - 195 
to create 4 unit test for the getter and setter methods for Minimum & Maximum inventory within the Part class

```
   @Test
    void getMinInv() {
        int min_inv=5;
        partIn.setMinInv(min_inv);
        assertEquals(min_inv,partIn.getMinInv());
        partOut.setMinInv(min_inv);
        assertEquals(min_inv,partOut.getMinInv());
    }

    @Test
    void setMinInv() {
        int min_inv=5;
        partIn.setMinInv(min_inv);
        assertEquals(min_inv,partIn.getMinInv());
        partOut.setMinInv(min_inv);
        assertEquals(min_inv,partOut.getMinInv());
    }

    @Test
    void getMaxInv() {
        int max_inv=195;
        partIn.setMaxInv(max_inv);
        assertEquals(max_inv,partIn.getMaxInv());
        partOut.setMaxInv(max_inv);
        assertEquals(max_inv,partOut.getMaxInv());
    }

    @Test
    void setMaxInv() {
        int max_inv=195;
        partIn.setMaxInv(max_inv);
        assertEquals(max_inv,partIn.getMaxInv());
        partOut.setMaxInv(max_inv);
        assertEquals(max_inv,partOut.getMaxInv());
    }

```
*******************

**J.  Remove the class files for any unused validators in order to clean your code.**

DELETED unused validator: 

_filename: DeletePartValidator.java_

_filename: ValidDeletePart.java_
