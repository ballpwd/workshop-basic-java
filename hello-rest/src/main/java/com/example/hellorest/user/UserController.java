package com.example.hellorest.user;

import com.example.hellorest.employee.EmployeeResponse;
import com.example.hellorest.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService ;

    @GetMapping("/user")
    public List<UserModel> getAllEvenUser() {
        return userService.getAllEvenUser() ;
    }

}
