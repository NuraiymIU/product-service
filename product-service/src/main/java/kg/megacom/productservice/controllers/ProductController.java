package kg.megacom.productservice.controllers;

import kg.megacom.productservice.models.dto.ProductEx2Dto;
import kg.megacom.productservice.models.dto.Task2;
import kg.megacom.productservice.models.enums.Type;
import kg.megacom.productservice.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/ex2")
    public List<ProductEx2Dto> getAllMakersByType(@RequestParam Type type){
        return productService.getAllMakersByType(type);
    }

    @GetMapping("/task2")
    public List<Task2> getTask2(@RequestParam String type){
        return  productService.task2(type);
    }
}
