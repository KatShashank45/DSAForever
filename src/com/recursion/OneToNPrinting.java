package com.recursion;

public class OneToNPrinting {

    public static void main(String[] args) {
        OneToNPrinting.untilNPrinting(1,27);
    }

    private static void untilNPrinting(int start , int end){

        if(start > end)return;

        System.out.println(start);
        untilNPrinting(start+1 , end);
    }
}
