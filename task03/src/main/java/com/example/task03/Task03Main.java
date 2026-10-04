package com.example.task03;

public class Task03Main {

    public static void main(String[] args) {
        ComplexNumbers с1 = new ComplexNumbers(10, 45);
        ComplexNumbers с2 = new ComplexNumbers(78, 12);

        System.out.println("Number 1: " + с1);
        System.out.println("Number 2: " + с2);

        ComplexNumbers sum = с1.add(с2);
        System.out.println("Sum: " + sum);

        ComplexNumbers mult = с1.multiply(с2);
        System.out.println("Multiply: " + mult);

    }
}


