package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        int entero = 10;
        double numeroDouble = entero;

        System.out.println("entero: " + entero);
        System.out.println("numeroDouble: " + numeroDouble);
    }

    public static void demostrarCastingExplicito() {
        double conDecimales = 9.99;
        int convertido = (int) conDecimales;

        System.out.println("conDecimales: " + conDecimales);
        System.out.println("convertido a int: " + convertido);
    }

    public static void demostrarProblemasDePrecision() {
        long gigante = 100000000000L;
        short resultado = (short) gigante;

        System.out.println("gigante (long): " + gigante);
        System.out.println("resultado (short): " + resultado);
    }
}
