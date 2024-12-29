package org.niroshan.applepc_store.Searvice.Implementation;

import lombok.AllArgsConstructor;
import org.niroshan.applepc_store.Dto.EmployeeDto;
import org.niroshan.applepc_store.Entity.Employee;
import org.niroshan.applepc_store.Mapper.EmployeeMapping;
import org.niroshan.applepc_store.Repository.EmployeeRepository;
import org.niroshan.applepc_store.Searvice.EmployeeSearvice;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeSearviceImp implements EmployeeSearvice {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapping.maptoEmployee(employeeDto);
         Employee savedEmployee =  employeeRepository.save(employee);
        return EmployeeMapping.maptoEmployeeDto(savedEmployee);
    }
}
