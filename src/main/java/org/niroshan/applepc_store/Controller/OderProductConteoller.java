package org.niroshan.applepc_store.Controller;

import org.niroshan.applepc_store.Dto.OderProductDto;
import org.niroshan.applepc_store.Entity.OderProduct;
import org.niroshan.applepc_store.Searvice.OderProductSearvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/oderproduct")
public class OderProductConteoller {

    private OderProductSearvice orderProductSearvice;

    public OderProductConteoller (OderProductSearvice orderProductSearvice) {
        this.orderProductSearvice = orderProductSearvice;
    }

    @PostMapping
    public ResponseEntity<OderProductDto> createOderProduct(@RequestBody OderProductDto orderProductDto) {
        OderProductDto saveOderProduct = orderProductSearvice.createOderProduct(orderProductDto);
        return new ResponseEntity<>(saveOderProduct, HttpStatus.CREATED);
    }
}
