package com.recursion;

public class PowerCalculator {

    private double power(double x, long n) {
        System.out.println("power(x = " + x + ", n = " + n + ")");
        
        if (n == 0) return 1.0;
        if (n == 1) return x;

        if (n % 2 == 0) {
            System.out.println("Even exponent: squaring base");
            return power(x * x, n / 2);
        }

        System.out.println("Odd exponent: multiplying base once and reducing n");
        return x * power(x, n - 1);
    }

    public double myPow(double x, int n) {
        System.out.println("myPow(x = " + x + ", n = " + n + ")");
        
        long N = n;
        if (N < 0) {
            System.out.println("Negative exponent: calculating reciprocal");
            return 1.0 / power(x, -N);
        }

        return power(x, N);
    }

    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        
        double base = 2.0;
        int exponent = 4;

        System.out.println("Calling myPow...");
        double result = calculator.myPow(base, exponent);

        System.out.println("Final Result: " + result);
    }
}
