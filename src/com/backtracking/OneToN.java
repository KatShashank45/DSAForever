package com.backtracking;

public class OneToN {

    public static void main(String[] args) {

        OneToN.oneToN(3);
    }

    private static void oneToN(int i){
        if(i < 1)return;

        oneToN(i-1);
        System.out.println(i);
    }
}
