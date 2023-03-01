package com.yaswanth.SimpleCalculator;

public class Subtraction extends SimpleCalculator{
    public Subtraction(double num1, double num2){
        super(num1, num2);
    }

    public double calculate(){
        return getNum1() - getNum2();
    }
}
