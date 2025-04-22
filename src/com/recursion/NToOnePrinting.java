package com.recursion;

public class NToOnePrinting {

    public static void main(String[] args) {

        NToOnePrinting.nToOne(27,1);

    }

    private static void nToOne (int end , int start){
        if(end < start)return;

        System.out.println(end);
        nToOne(end-1 , start);

    }
}
