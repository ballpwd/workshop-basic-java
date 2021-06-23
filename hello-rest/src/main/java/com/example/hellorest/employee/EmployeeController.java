package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    private MyRandom random ;

    @Autowired
    private EmployeeRepository repository;


    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable  String id) {

        // Validate id => Number only
        int _id = 0;

        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            // ERROR => TODO ?
        }

        Employee result = repository.getById(_id);
        return new EmployeeResponse(result.getId(),result.getFirstName(),result.getLastName()) ;

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

        Employee result = repository.getById(_id);
        return new EmployeeResponse(result.getId(),result.getFirstName(),result.getLastName()) ;

    }

    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody EmployeeRequest request){

        Employee employee =  new Employee(request.getFname(), request.getLname());
        Employee result =  repository.save(employee);

        return new EmployeeResponse(result.getId(),result.getFirstName(),result.getLastName()) ;

    }

}


