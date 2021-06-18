package com.example.hellospring.workshop01;

public class FizzBuzzCondition implements MyCondition {

    public boolean check(int input) {
        return input % 3 == 0 && input % 5 == 0 ;
    }

    public String getResult() {
        return "FizzBuzz" ;
    }

}
