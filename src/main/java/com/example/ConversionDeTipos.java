package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        int entero = 10;
        double numeroDouble = entero; // casting implícito (int -> double)

        System.out.println("entero: " + entero);
        System.out.println("numeroDouble: " + numeroDouble);
    }

    public static void demostrarCastingExplicito() {
        double conDecimales = 9.99;
        int convertido = (int) conDecimales; // se pierde la parte decimal

        System.out.println("conDecimales: " + conDecimales);
        System.out.println("convertido a int: " + convertido);
    }

    public static void demostrarProblemasDePrecision() {
        long gigante = 100000000000L; // un número grande
        short resultado = (short) gigante; // desbordamiento (overflow)

        System.out.println("gigante (long): " + gigante);
        System.out.println("resultado (short): " + resultado);
    }
}
