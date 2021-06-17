import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    public void testCase1(){
        MySort mySort = new MySort(new ArrayList<Integer>()) ;
        List<Integer> result = mySort.sort();
        assertEquals(Arrays.asList(),result);
    }

    @Test
    public void testCase2(){
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sort();
        assertEquals(Arrays.asList(1),result);
    }

    @Test
    public void testCase3(){
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sort();
        assertEquals(Arrays.asList(1,2),result);
    }

    @Test
    public void testCase4(){
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(2,1));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sort();
        assertEquals(Arrays.asList(1,2),result);
    }

    @Test
    public void testCase5(){
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sort();
        assertEquals(Arrays.asList(1,2,3),result);
    }

    @Test
    public void testCase6(){
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(2,1,3));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sort();
        assertEquals(Arrays.asList(1,2,3),result);
    }

    @Test
    public void testCase7(){
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1,3,2));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sort();
        assertEquals(Arrays.asList(1,2,3),result);
    }

    @Test
    public void testCase8(){
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(3,2,1));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sort();
        assertEquals(Arrays.asList(1,2,3),result);
    }

    @Test
    public void testCase9(){
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sort();
        assertEquals(Arrays.asList(1,2,3,4,5),result);
    }
}