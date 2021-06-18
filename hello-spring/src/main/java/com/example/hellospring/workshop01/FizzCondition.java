package com.example.hellospring.workshop01;

public class FizzCondition implements MyCondition {

    public boolean check(int input) {
        return input % 3 == 0  ;
    }

    public String getResult() {
        return "Fizz" ;
    }
}
