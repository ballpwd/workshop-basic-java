import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    public void testCase1(){
        MySort mySort = new MySort(new ArrayList<Integer>()) ;
        List<Integer> result = mySort.sortCase01();
        assertEquals(Arrays.asList(),result);
    }

    @Test
    public void testCase2(){
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sortCase02();
        assertEquals(Arrays.asList(1,2),result);
    }

    @Test
    public void testCase3(){
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(2,1));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sortCase03();
        assertEquals(Arrays.asList(1,2),result);
    }
}