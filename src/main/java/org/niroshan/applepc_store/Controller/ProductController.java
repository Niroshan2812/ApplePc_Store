package org.niroshan.applepc_store.Controller;

import org.niroshan.applepc_store.Dto.ProductDto;
import org.niroshan.applepc_store.Searvice.ProductSearvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductSearvice productSearvice;

    public ProductController(ProductSearvice productSearvice) {
        this.productSearvice = productSearvice;
    }

    @PostMapping
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDto) {
        ProductDto createProduct =  productSearvice.createProduct(productDto);
        return new ResponseEntity<>(createProduct, HttpStatus.CREATED);
    }

}
