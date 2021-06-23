package com.example.hellorest.user;

import com.example.hellorest.employee.Employee;
import com.example.hellorest.employee.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserGateway userGateway;

    public List<UserModel> getAllEvenUser() {
        List<UserModel> users = userGateway.getAllUsers();
        List<UserModel> result = new ArrayList<>();

        for (UserModel user : users) {
            if (user.getId() % 2 == 0) {
                result.add(user);
            }
        }

        return result;
    }

}
