package com.example.hellospring.workshop01;

public class KBTGCondition implements MyCondition {

    public boolean check(int input) {
        return input % 7 == 0 ;
    }

    public String getResult() {
        return "KBTG" ;
    }

}
