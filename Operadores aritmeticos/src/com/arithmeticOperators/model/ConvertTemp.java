package com.arithmeticOperators.model;

public class ConvertTemp {

    int Fahrenheit;
    double Celsius;

    public int getFahrenheit(){
        return Fahrenheit;
    }

    public void setFahrenheit(int Fahrenheit){
        this.Fahrenheit = Fahrenheit;
    }

    public double getCelsius(){
        return Celsius;
    }

    public void setCelsius(double Celsius){
        this.Celsius = Celsius;
    }

    public double convert(int F){
        double C = (F - 32)/1.8;
        
        return C;
    }
    
}
