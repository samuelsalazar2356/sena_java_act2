package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: división por cero.");
        }
    }

    public static void ejemploTryCatchInput() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingresa un número entero: ");
            int x = sc.nextInt();
            System.out.println("Número ingresado: " + x);
        } catch (InputMismatchException e) {
            System.out.println("Error: debes ingresar un entero.");
        } finally {
            // Cerramos el scanner como pide el ejercicio (aunque normalmente no siempre se recomienda)
            sc.close();
        }
    }

    public static void ejemploBloqueFinally() {
        try {
            int[] datos = {1, 2, 3};
            System.out.println(datos[5]); // provoca ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Finally: se ejecuta siempre.");
        }
    }

    public static void evitarCierrePrograma() {
   
        System.out.println("Ejemplo: evitamos cerrar el programa con System.exit.");
    }
}
