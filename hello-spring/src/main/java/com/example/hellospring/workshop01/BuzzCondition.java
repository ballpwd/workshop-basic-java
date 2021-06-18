package com.example.hellospring.workshop01;

public class BuzzCondition implements MyCondition {

    public boolean check(int input) {
        return input % 5 == 0 ;
    }

    public String getResult() {
        return "Buzz" ;
    }
}
