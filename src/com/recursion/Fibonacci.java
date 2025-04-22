package com.recursion;

public class Fibonacci {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(7));
    }

    private int fib(int num){
        if(num == 0)return 0;
        if(num == 1)return 1;

        return fib(num-1)+ fib(num-2);
    }
}
