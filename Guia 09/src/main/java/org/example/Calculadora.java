package org.example;

public class Calculadora {

    public double sumar(double unNumero, double otroNumero){
        return (unNumero+otroNumero);
    }

    public double restar(double unNumero, double otroNumero){
        return (unNumero-otroNumero);
    }

    public double multiplicar(double unNumero, double otroNumero){
        return (unNumero*otroNumero);
    }

    public double dividir(double unNumero, double otroNumero){
        if(otroNumero==0){
            throw new ArithmeticException("no se puede dividir por base 0");
        }else{
            return (unNumero/otroNumero);
        }
    }
}