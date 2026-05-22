package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        System.out.println("============================");
        System.out.println("      MI ENCABEZADO         ");
        System.out.println("============================");
    }

    public static void ejemploPasoParametros(String nombre) {
        System.out.println("Hola, " + nombre + ". Bienvenido/a.");
    }

    public static int ejemploRetornoValores() {
        int a = 10;
        int b = 20;
        int suma = a + b;
        return suma;
    }

    // Sobrecarga simple: sumar con diferentes tipos
    public static void ejemploSobrecarga() {
        int resultado = sumar(3, 4);
        System.out.println("Sumar int: " + resultado);
    }

    public static void ejemploSobrecarga(int n) {
        double resultado = sumar(n, 2.5);
        System.out.println("Sumar double: " + resultado);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }
}
