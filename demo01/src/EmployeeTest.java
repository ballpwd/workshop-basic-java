import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("เมื่อทำการสร้าง employee ด้วย constructor " + "จะต้องได้ fullname = ':' ")
    public void case01(){
        String expectedResult = " : ";
        Employee demo = new Employee(); // Default constructor
        String actualResult = demo.getFullName();
        // Assert or check
        assertEquals(expectedResult , actualResult);
    }

    @Test
    @DisplayName("เมื่อทำการสร้าง employee ด้วย puwadech ball " + "จะต้องได้ fullname = 'puwadech : ball' ")
    public void case02(){
        String expectedResult = "puwadech : ball";
        Employee demo = new Employee("puwadech","ball"); // Default constructor
        String actualResult = demo.getFullName();
        // Assert or check
        assertEquals(expectedResult , actualResult);
    }

}