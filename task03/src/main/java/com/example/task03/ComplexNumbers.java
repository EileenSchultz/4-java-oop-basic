package com.example.task03;

public class ComplexNumbers {
    private double real;
    private double imaginary;

    public ComplexNumbers(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumbers add(ComplexNumbers other){
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumbers(newReal, newImaginary);
    }
    public ComplexNumbers multiply(ComplexNumbers other){
        //(a₁a₂ – b₁b₂) + (a₁b₂ + a₂b₁)
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumbers(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (this.imaginary >= 0) {
            return this.real + " + " + this.imaginary + "i";
        } else {
            return this.real + " - " + Math.abs(this.imaginary) + "i";
        }
    }
}
