package com.basicCalculator;

public class Calculator {
    // Calculator constructor
    public Calculator(){}

    // Methods to complete calculations
    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

    public static int modulo(int a, int b){
        return a % b;
    }

    public static void main(String[] args){

        //myCalculator object
        Calculator myCalculator = new Calculator();

        //use calculator object to do some calculations
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
        System.out.println(myCalculator.multiply(5,4));
        System.out.println(myCalculator.divide(45,7));
        System.out.println(myCalculator.modulo(10,3));
    }
}

