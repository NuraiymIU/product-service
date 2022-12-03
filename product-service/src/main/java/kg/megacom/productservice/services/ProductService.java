package kg.megacom.productservice.services;

import kg.megacom.productservice.models.dto.ProductEx2Dto;
import kg.megacom.productservice.models.dto.Task2;
import kg.megacom.productservice.models.enums.Type;

import java.util.List;

public interface ProductService {

    List<ProductEx2Dto> getAllMakersByType(Type type);

    List<Task2> task2(String type);
}
