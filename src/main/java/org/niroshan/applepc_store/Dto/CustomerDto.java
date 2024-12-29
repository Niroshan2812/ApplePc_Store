package org.niroshan.applepc_store.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private Long CustomerId;
    private String CustomerName;
    private String  customerAddress;
    private int CustomerPhone;
}
