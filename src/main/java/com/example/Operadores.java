package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        double nota1 = 4.0;
        double nota2 = 3.5;
        double nota3 = 5.0;

        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Promedio: " + promedio);
    }

    public static void demostrarIncrementoDecremento() {
        int i = 5;
        System.out.println("i++ (imprime antes): " + i++);
        System.out.println("Luego de i++: i=" + i);

        i = 5;
        System.out.println("++i (incrementa antes): " + ++i);
        System.out.println("Luego de ++i: i=" + i);
    }

    public static void demostrarRelacionales() {
        int numero = 20;
        boolean esMayorQueDiez = numero > 10;
        boolean esMenorQueCincuenta = numero < 50;

        System.out.println("numero > 10: " + esMayorQueDiez);
        System.out.println("numero < 50: " + esMenorQueCincuenta);
    }

    public static void demostrarLogicos() {
        int numero = 30;
        boolean entreDiezYCincuenta = (numero > 10) && (numero < 50);

        System.out.println("numero es >10 y <50: " + entreDiezYCincuenta);
    }

    public static void demostrarAsignacionCompuesta() {
        int a = 10;
        a += 5;
        System.out.println("a += 5: " + a);

        a -= 2;
        System.out.println("a -= 2: " + a);
    }

    public static void demostrarOperadorTernario() {
        int numero = 7;
        String resultado = (numero >= 0) ? "Positivo" : "Negativo";
        System.out.println("El número es: " + resultado);
    }
}
