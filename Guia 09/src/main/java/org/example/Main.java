package org.example;


public class Main {
        public static void main(String[] args) {
                try {
                        Calculadora calcu=new Calculadora();

                        System.out.println("Suma: "+calcu.sumar(2,3));
                        System.out.println("Resta: "+calcu.restar(2,3));
                        System.out.println("Multiplicación: "+calcu.multiplicar(2,3));
                        System.out.println("División: "+calcu.dividir(2,3));

                }
                catch (Exception e){
                        System.out.println("Excepción " + e.getMessage());
                }
        }
}