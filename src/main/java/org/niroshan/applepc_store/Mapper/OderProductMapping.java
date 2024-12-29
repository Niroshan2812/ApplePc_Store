package org.niroshan.applepc_store.Mapper;

import org.niroshan.applepc_store.Dto.OderProductDto;
import org.niroshan.applepc_store.Entity.OderProduct;

public class OderProductMapping {
    public static OderProductDto mapOderProductDto(OderProduct oderProduct) {
        System.out.println("This is oder"+oderProduct.getOderStatus());
        return new OderProductDto(

                oderProduct.getOderId(),
                oderProduct.getOrderDate(),
                oderProduct.getOderStatus()
        );
    }

    public static OderProduct maptoOderProduct(OderProductDto oderProductDto) {
        return new OderProduct(
                oderProductDto.getOderId(),
                oderProductDto.getOrderDate(),
                oderProductDto.getOderStatus()

        );
    }
}
