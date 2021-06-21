package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable  String id) {

        // Validate id => Number only
        int _id = 0;

        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            _id = 0 ;
        }




        return new EmployeeResponse(_id,"Puwadech","Ball") ;
    }


}


