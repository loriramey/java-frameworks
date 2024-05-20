package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;


    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, InhousePartRepository inhousePartRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inhousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

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
        op1.setId(700);
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
        op2.setId(705);
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
        op5.setId(710);
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


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
