import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    public void testCase1(){
        MySort mySort = new MySort(new ArrayList());
        List<Integer> result = mySort.sortCase01();
        assertEquals(new ArrayList(),result);
    }
}