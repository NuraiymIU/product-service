package kg.megacom.productservice.services.impl;

import kg.megacom.productservice.dao.LaptopRepo;
import kg.megacom.productservice.models.dto.LaptopEx3Dto;
import kg.megacom.productservice.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    private LaptopRepo laptopRepo;

    @Autowired
    public LaptopServiceImpl(LaptopRepo laptopRepo) {
        this.laptopRepo = laptopRepo;
    }

    @Override
    public List<LaptopEx3Dto> findAllLaptopWherePriceMoreThan(double price) {
        return laptopRepo.findAllLaptopWherePriceMoreThan(price);
    }
}
