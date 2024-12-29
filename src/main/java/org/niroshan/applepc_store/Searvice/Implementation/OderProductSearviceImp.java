package org.niroshan.applepc_store.Searvice.Implementation;

import lombok.AllArgsConstructor;
import org.niroshan.applepc_store.Dto.OderProductDto;
import org.niroshan.applepc_store.Entity.OderProduct;
import org.niroshan.applepc_store.Mapper.EmployeeMapping;
import org.niroshan.applepc_store.Mapper.OderProductMapping;
import org.niroshan.applepc_store.Repository.ProductOderRepo;
import org.niroshan.applepc_store.Searvice.OderProductSearvice;
import org.springframework.stereotype.Service;

@Service

public class OderProductSearviceImp implements OderProductSearvice {

    private ProductOderRepo productOderRepo;

    public OderProductSearviceImp(ProductOderRepo productOderRepo) {
        this.productOderRepo = productOderRepo;
    }

    @Override
    public OderProductDto createOderProduct(OderProductDto oderProductDto) {
        OderProduct oderProduct = OderProductMapping.maptoOderProduct(oderProductDto);
        OderProduct savedOderProduct = productOderRepo.save(oderProduct);
        return OderProductMapping.mapOderProductDto(savedOderProduct);
    }
}
