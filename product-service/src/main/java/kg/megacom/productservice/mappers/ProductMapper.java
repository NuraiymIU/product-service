package kg.megacom.productservice.mappers;

import kg.megacom.productservice.mappers.impl.ProductMapperImpl;
import kg.megacom.productservice.models.dto.ProductEx2Dto;
import kg.megacom.productservice.models.entity.Product;

import java.util.List;

public interface ProductMapper {
    ProductMapper INSTANCE = new ProductMapperImpl();

    List<ProductEx2Dto> productListToProductEx2DtoList(List<Product> productList);
}
