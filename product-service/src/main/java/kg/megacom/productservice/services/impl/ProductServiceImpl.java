package kg.megacom.productservice.services.impl;

import kg.megacom.productservice.dao.ProductRepository;
import kg.megacom.productservice.mappers.ProductMapper;
import kg.megacom.productservice.models.dto.ProductEx2Dto;
import kg.megacom.productservice.models.dto.Task2;
import kg.megacom.productservice.models.entity.Product;
import kg.megacom.productservice.models.enums.Type;
import kg.megacom.productservice.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public List<ProductEx2Dto> getAllMakersByType(Type type) {
        List<Product> productList = productRepository.findDistinctByType(type);
        return ProductMapper.INSTANCE.productListToProductEx2DtoList(productList);
    }

    @Override
    public List<Task2> task2(String type) {
        return productRepository.task2Query(type);
    }
}
