package com.recursion;
public class PrintNameNTimes {

    public static void main(String[] args) {
        PrintNameNTimes.printNTimes(1 , 10);
    }

    private static void printNTimes(int i , int n){
        if (i > n)return;

        System.out.println("Hello I'm getting printed again and again");
        printNTimes(i+1 , n);
    }
}
