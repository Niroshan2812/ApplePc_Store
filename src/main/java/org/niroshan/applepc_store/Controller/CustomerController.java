package org.niroshan.applepc_store.Controller;

import org.niroshan.applepc_store.Dto.CustomerDto;
import org.niroshan.applepc_store.Searvice.CustomerSearvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    private CustomerSearvice customerSearvice;

    public CustomerController(CustomerSearvice customerSearvice) {
        this.customerSearvice = customerSearvice;
    }

    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto createdCustomer = customerSearvice.createCustomer(customerDto);
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }
}
