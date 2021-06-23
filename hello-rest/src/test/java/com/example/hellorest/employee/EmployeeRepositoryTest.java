package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository repository ;

    @Test
    public void foundWithId1(){
        Employee data = new Employee("Puwadech from DB","Ball from DB");
        repository.save(data);

        Employee employee1 = repository.getById(1);
        assertEquals(1,employee1.getId());
        assertEquals("Puwadech from DB",employee1.getFirstName());
        assertEquals("Ball from DB",employee1.getLastName());
    }

}