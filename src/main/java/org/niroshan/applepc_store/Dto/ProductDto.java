package org.niroshan.applepc_store.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private int id;
    private String pname;
    private String pDescription;
    private String qtyInstock;
    private double price;
}
