package kg.megacom.productservice.mappers.impl;

import kg.megacom.productservice.mappers.ProductMapper;
import kg.megacom.productservice.models.dto.ProductEx2Dto;
import kg.megacom.productservice.models.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductMapperImpl implements ProductMapper {
    @Override
    public List<ProductEx2Dto> productListToProductEx2DtoList(List<Product> productList) {
        List<ProductEx2Dto> productEx2DtoList = new ArrayList<>();

        productList.stream().forEach(p->{
            ProductEx2Dto productEx2Dto = new ProductEx2Dto();
            productEx2Dto.setMaker(p.getMaker());
            productEx2DtoList.add(productEx2Dto);
        });
        return productEx2DtoList;
    }
}
