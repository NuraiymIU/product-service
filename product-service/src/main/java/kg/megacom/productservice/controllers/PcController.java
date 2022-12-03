package kg.megacom.productservice.controllers;

import kg.megacom.productservice.models.dto.PcEx1Dto;
import kg.megacom.productservice.models.dto.Task1;
import kg.megacom.productservice.services.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pc")
public class PcController {

    private PcService pcService;

    @Autowired
    public PcController(PcService pcService) {
        this.pcService = pcService;
    }

    @GetMapping("/ex1")
    public List<PcEx1Dto> firstExercise(@RequestParam double price) {
        return pcService.getAllPcByPrice(price);
    }

    @GetMapping("/task1")
    public List<Task1> getTask1(@RequestParam double price) {
        return pcService.task1(price);
    }
}


