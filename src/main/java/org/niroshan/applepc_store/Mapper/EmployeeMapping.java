package org.niroshan.applepc_store.Mapper;

import org.niroshan.applepc_store.Dto.EmployeeDto;
import org.niroshan.applepc_store.Entity.Employee;

public class EmployeeMapping {
    public static EmployeeDto maptoEmployeeDto (Employee employee){
        return new EmployeeDto(
                employee.getEmployee_id(),
                employee.getLname(),
                employee.getFname(),
                employee.getEmail()
        );
    }
    public static Employee maptoEmployee (EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getEmployee_id(),
                employeeDto.getLname(),
                employeeDto.getFname(),
                employeeDto.getEmail()
        );
    }
}
