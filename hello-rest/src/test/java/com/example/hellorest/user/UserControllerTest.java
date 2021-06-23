package com.example.hellorest.user;

import com.example.hellorest.employee.EmployeeRepository;
import com.example.hellorest.employee.EmployeeResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void callUserApi() {
        List<UserModel> response = restTemplate.getForObject("/user", List.class);
        assertEquals(5,response.size());

    }

}