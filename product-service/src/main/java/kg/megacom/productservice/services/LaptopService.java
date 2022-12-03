package kg.megacom.productservice.services;

import kg.megacom.productservice.models.dto.LaptopEx3Dto;

import java.util.List;

public interface LaptopService {
    List<LaptopEx3Dto> findAllLaptopWherePriceMoreThan(double price);
}
