package org.niroshan.applepc_store.Searvice.Implementation;

import lombok.AllArgsConstructor;
import org.niroshan.applepc_store.Dto.CustomerDto;
import org.niroshan.applepc_store.Entity.Customer;
import org.niroshan.applepc_store.Mapper.CustomerMapping;
import org.niroshan.applepc_store.Repository.CustomerRepo;
import org.niroshan.applepc_store.Searvice.CustomerSearvice;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerSearviceImp implements CustomerSearvice {
    private CustomerRepo customerRepo;
    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        Customer customer = CustomerMapping.maptoCustomer(customerDto);
        Customer saveCustomer = customerRepo.save(customer);
        return CustomerMapping.maptocustomerDto(saveCustomer);
    }
}