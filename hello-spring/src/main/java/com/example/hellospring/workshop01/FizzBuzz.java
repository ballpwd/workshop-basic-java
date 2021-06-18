package com.example.hellospring.workshop01;

public class FizzBuzz {
    int input ;

    public FizzBuzz(int input) {
        this.input = input;
    }

    public String getResult(){

        MyCondition[] conditions = new MyCondition[]{
            new FizzBuzzCondition(),
            new FizzCondition(),
            new BuzzCondition(),
            new KBTGCondition(),
        };

        for (MyCondition condition : conditions) {
            if(condition.check(input)) {
                return condition.getResult();
            }
        }

        return String.valueOf(input);


    }
}