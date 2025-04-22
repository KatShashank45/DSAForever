package com.recursion;

public class SumFromOneToN {

    public static void main(String[] args) {

        System.out.println(SumFromOneToN.sum(1, 15));

        System.out.println(SumFromOneToN.sum2(9));

    }

    private static int sum(int from , int until){
        if(from > until)return 0;

        return from + sum(from + 1 , until);
    }


    private static int sum2(int n){
        if( n == 0)return 0;

        return n + sum2(n-1);
    }
}
