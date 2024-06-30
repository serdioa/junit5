package de.serdioa.junit;


public class Calculator {

    private double value = 0.0;


    public void set(double value) {
        this.value = value;
    }


    public double get() {
        return this.value;
    }


    public Calculator add(double value) {
        this.value += value;
        return this;
    }


    public Calculator subtract(double value) {
        this.value -= value;
        return this;
    }


    public Calculator multiply(double value) {
        this.value *= value;
        return this;
    }


    public Calculator divide(double value) {
        this.value /= value;
        return this;
    }
}
