package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

public class EmployeeControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void callApiWithPathVariable(){
        EmployeeResponse expected = new EmployeeResponse(123,"Puwadech","Ball") ;
        EmployeeResponse response = restTemplate.getForObject("/employee/123",EmployeeResponse.class);
        assertEquals(123,response.getId());
        assertEquals("Puwadech",response.getFname());
        assertEquals("Ball",response.getLname());
        assertEquals(expected,response);
    }

    @Test
    public void callApiWithRequestParameter(){
        EmployeeResponse response = restTemplate.getForObject("/employee?id=999",EmployeeResponse.class);
        assertEquals(999,response.getId());
        assertEquals("Puwadech",response.getFname());
        assertEquals("Ball",response.getLname());
    }

}