package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class EmployeeController {

    @Autowired
    private MyRandom random ;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable  String id) {

        // Validate id => Number only
        int _id = 0;

        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            // ERROR => TODO ?
        }
        // Workshop

        int number = random.nextInt(10);
        return new EmployeeResponse(_id,"Puwadech"+number,"Ball") ;
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeById2(@RequestParam(defaultValue = "100") String id) {

        // Validate id => Number only
        int _id = 0;

        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            // ERROR => TODO ?
        }

        return new EmployeeResponse(_id,"Puwadech","Ball") ;
    }

    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody EmployeeRequest request){
        return new EmployeeResponse(999, request.getFname(),request.getLname());
    }

}


