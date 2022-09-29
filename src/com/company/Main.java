package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Llamar a la función en el main y darle valores.
        var suma = sum(1, 2, 3);
        //System.out.println("suma: ", a, " + ", b, " + ", c, "=",suma);
        System.out.println("suma: "+ suma);

        Coche card = new Coche();
        card.incrementarPuerta();
        card.incrementarPuerta();
        System.out.println(card.puerta);
    }

    // Crear una función con tres parámetros que sean números que se suman entre sí.
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
}
