package org.niroshan.applepc_store.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
    private Long employee_id;
    private String lname;
    private String fname;
    private String email;
}
