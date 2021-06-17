import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {

    @Test
    public void startWithExclude() {
        MyRange2 myRange = new MyRange2("(1,5]");
        boolean isExclude = myRange.startWithExclude();
        assertTrue(isExclude);
    }

    @Test
    public void endWithExclude() {
        MyRange2 myRange = new MyRange2("(1,5)");
        boolean isExclude = myRange.endWithExclude();
        assertTrue(isExclude);
    }

    @Test
    public void getStartNumber() {
        MyRange2 myRange = new MyRange2("(1,5)");
        int firstNumber = myRange.getStartNumber();
        assertEquals(2,firstNumber);
    }

    @Test
    public void getEndNumber() {
        MyRange2 myRange = new MyRange2("(1,5)");
        int endNumber = myRange.getEndNumber();
        assertEquals(4,endNumber);
    }

    @Test
    public void getResult() {
        MyRange2 myRange = new MyRange2("(1,5)");
        String result  = myRange.getResult();
        assertEquals("2,3,4",result);
    }

}