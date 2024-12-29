package org.niroshan.applepc_store.Controller;

import org.niroshan.applepc_store.Dto.EmployeeDto;
import org.niroshan.applepc_store.Searvice.EmployeeSearvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Employee")
public class EmployeeController {
    private  EmployeeSearvice employeeSearvice;

    public EmployeeController(EmployeeSearvice employeeSearvice) {
        this.employeeSearvice = employeeSearvice;
    }
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {

          EmployeeDto createdEmployee = employeeSearvice.createEmployee(employeeDto);

          return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);

    }


}
