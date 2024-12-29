package org.niroshan.applepc_store.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OderProductDto {
    private Long oderId;
    private Date orderDate;
    private String oderStatus;

}
