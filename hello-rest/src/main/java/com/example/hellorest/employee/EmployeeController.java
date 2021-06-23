package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.Optional;
import java.util.Random;


@RestController
public class EmployeeController {

    @Bean
    public Random createNewRandom() {
        return new Random();
    }

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable  String id) {

        // Validate id => Number only
        int _id = 0;

        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            // ERROR => TODO ?
        }

        // Delegate to service
        EmployeeResponse employeeResponse = employeeService.process(_id);
        return employeeResponse;
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeById2(@RequestParam String id) {

        // Validate id => Number only
        int _id = 0;

        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            // ERROR => TODO ?
        }

        return new EmployeeResponse(_id, "Puwadech", "Ball");

    }

    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody EmployeeRequest request){

        return new EmployeeResponse(999, request.getFname(), request.getLname());
//        Employee employee =  new Employee(request.getFname(), request.getLname());
//        Employee result =  repository.save(employee);
//
//        return new EmployeeResponse(result.getId(),result.getFirstName(),result.getLastName()) ;

    }

}


