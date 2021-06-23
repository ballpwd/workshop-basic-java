package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

public class EmployeeControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    private MyRandom random ;

    @Test
    public void callApiWithPathVariable(){

        // Mock /Stub /Spy
        when(random.nextInt(anyInt())).thenReturn(5);

        EmployeeResponse expected = new EmployeeResponse(123,"Puwadech5","Ball") ;
        EmployeeResponse response = restTemplate.getForObject("/employee/123",EmployeeResponse.class);
        assertEquals(123,response.getId());
        assertEquals("Puwadech5",response.getFname());
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

    @Test
    public void testCreateEmployee(){

        EmployeeResponse expected = new EmployeeResponse(999,"Puwadech","Ball") ;
        EmployeeRequest requestObject = new EmployeeRequest("Puwadech", "Ball");
        HttpEntity<EmployeeRequest> request = new HttpEntity<>(requestObject);
        EmployeeResponse response = restTemplate.postForObject("/employee", request, EmployeeResponse.class);
        assertEquals(999 , response.getId());
        assertEquals("Puwadech" , response.getFname());
        assertEquals("Ball" , response.getLname());
        assertEquals(expected , response);
    }
}