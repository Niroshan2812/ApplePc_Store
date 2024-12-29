package org.niroshan.applepc_store.Mapper;

import org.niroshan.applepc_store.Dto.ProductDto;
import org.niroshan.applepc_store.Entity.Product;

public class ProductMapping {
    public static Product maptoProduct(ProductDto productDto) {
        return  new  Product(
                productDto.getId(),
                productDto.getPname(),
                productDto.getPDescription(),
                productDto.getQtyInstock(),
                productDto.getPrice()
                );
    }
    public static ProductDto maptoProductDto(Product product) {
        return new ProductDto(
                product.getId(),
                product.getPname(),
                product.getPDescription(),
                product.getQtyInstock(),
                product.getPrice()
        );
    }
}
