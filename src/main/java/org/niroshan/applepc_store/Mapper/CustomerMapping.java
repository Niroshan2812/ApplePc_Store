package org.niroshan.applepc_store.Mapper;

import org.niroshan.applepc_store.Dto.CustomerDto;
import org.niroshan.applepc_store.Entity.Customer;

public class CustomerMapping {

    public static CustomerDto maptocustomerDto(Customer customer) {
      return new CustomerDto(
              customer.getCustomerId(),
              customer.getCustomerName(),
              customer.getCustomerAddress(),
              customer.getCustomerPhone()

      );
    }
    public static Customer maptoCustomer(CustomerDto customerDto) {
        return new Customer(
                customerDto.getCustomerId(),
                customerDto.getCustomerName(),
                customerDto.getCustomerAddress(),
                customerDto.getCustomerPhone()
        );
    }
}
