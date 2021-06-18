package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzTest {

    @Test
    public void test01(){
        FizzBuzz fizzBuzz= new FizzBuzz(1);
        String result = fizzBuzz.getResult() ;
        assertEquals("1",result);
    }

    @Test
    public void test02(){
        FizzBuzz fizzBuzz= new FizzBuzz(2);
        String result = fizzBuzz.getResult() ;
        assertEquals("2",result);
    }

    @Test
    public void test03(){
        FizzBuzz fizzBuzz= new FizzBuzz(3);
        String result = fizzBuzz.getResult() ;
        assertEquals("Fizz",result);
    }

    @Test
    public void test04(){
        FizzBuzz fizzBuzz= new FizzBuzz(4);
        String result = fizzBuzz.getResult() ;
        assertEquals("4",result);
    }

    @Test
    public void test05(){
        FizzBuzz fizzBuzz= new FizzBuzz(5);
        String result = fizzBuzz.getResult() ;
        assertEquals("Buzz",result);
    }

    @Test
    public void test06(){
        FizzBuzz fizzBuzz= new FizzBuzz(6);
        String result = fizzBuzz.getResult() ;
        assertEquals("Fizz",result);
    }

    @Test
    public void test07(){
        FizzBuzz fizzBuzz= new FizzBuzz(7);
        String result = fizzBuzz.getResult() ;
        assertEquals("7",result);
    }

    @Test
    public void test08(){
        FizzBuzz fizzBuzz= new FizzBuzz(8);
        String result = fizzBuzz.getResult() ;
        assertEquals("8",result);
    }

    @Test
    public void test09(){
        FizzBuzz fizzBuzz= new FizzBuzz(9);
        String result = fizzBuzz.getResult() ;
        assertEquals("Fizz",result);
    }

    @Test
    public void test10(){
        FizzBuzz fizzBuzz= new FizzBuzz(10);
        String result = fizzBuzz.getResult() ;
        assertEquals("Buzz",result);
    }

    @Test
    public void Test11(){
        FizzBuzz fizzBuzz= new FizzBuzz(11);
        String result = fizzBuzz.getResult() ;
        assertEquals("11",result);
    }

    @Test
    public void Test12(){
        FizzBuzz fizzBuzz= new FizzBuzz(12);
        String result = fizzBuzz.getResult() ;
        assertEquals("Fizz",result);
    }

    @Test
    public void test15(){
        FizzBuzz fizzBuzz= new FizzBuzz(15);
        String result = fizzBuzz.getResult() ;
        assertEquals("FizzBuzz",result);
    }

    @Test
    public void test30(){
        FizzBuzz fizzBuzz= new FizzBuzz(30);
        String result = fizzBuzz.getResult() ;
        assertEquals("FizzBuzz",result);
    }




}