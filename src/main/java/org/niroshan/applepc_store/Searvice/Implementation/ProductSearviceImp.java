package org.niroshan.applepc_store.Searvice.Implementation;

import org.niroshan.applepc_store.Dto.ProductDto;
import org.niroshan.applepc_store.Entity.Product;
import org.niroshan.applepc_store.Mapper.ProductMapping;
import org.niroshan.applepc_store.Repository.ProductRepo;
import org.niroshan.applepc_store.Searvice.ProductSearvice;

public class ProductSearviceImp implements ProductSearvice {

    private ProductRepo productRepo;

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = ProductMapping.maptoProduct(productDto);
        Product savedProduct = productRepo.save(product);
        return ProductMapping.maptoProductDto(savedProduct);
    }
}
