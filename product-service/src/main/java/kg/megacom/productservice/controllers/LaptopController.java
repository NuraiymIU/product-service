package kg.megacom.productservice.controllers;

import kg.megacom.productservice.models.dto.LaptopEx3Dto;
import kg.megacom.productservice.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/laptop")
public class LaptopController {

    private LaptopService laptopService;

    @Autowired
    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping("/ex3")
    public List<LaptopEx3Dto> findAllLaptopByPrice(@RequestParam double price) {
        return laptopService.findAllLaptopWherePriceMoreThan(price);
    }

}
