package com.example.hellospring.workshop01;

public class FizzBuzz {
    int input ;

    public FizzBuzz(int input) {
        this.input = input;
    }

    public String getResult(){
        String result = "" ;
        if(input % 3 == 0){
            result += "Fizz";
        }
        if(input % 5 == 0){
            result += "Buzz";
        }
        if(result.isEmpty()){
            result += input ;
        }
        return result ;
    }
}
