package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        int edad = 18;
        int edadMinimaVoto = 18;

        if (edad >= edadMinimaVoto) {
            System.out.println("Puedes votar.");
        }
    }

    public static void ejemploIfElse() {
        int edad = 16;
        int edadMinimaVoto = 18;

        if (edad >= edadMinimaVoto) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("Aún no puedes votar.");
        }
    }

    public static void ejemploIfElseIfElse() {
        int numero = 10;

        if (numero > 10) {
            System.out.println("Mayor que 10");
        } else if (numero == 10) {
            System.out.println("Es igual a 10");
        } else {
            System.out.println("Menor que 10");
        }
    }

    public static void ejemploSwitch() {
        int dia = 3; // 1..7
        String nombre;

        switch (dia) {
            case 1:
                nombre = "Lunes";
                break;
            case 2:
                nombre = "Martes";
                break;
            case 3:
                nombre = "Miércoles";
                break;
            case 4:
                nombre = "Jueves";
                break;
            case 5:
                nombre = "Viernes";
                break;
            case 6:
                nombre = "Sábado";
                break;
            case 7:
                nombre = "Domingo";
                break;
            default:
                nombre = "Día inválido";
                break;
        }

        System.out.println("Día: " + nombre);
    }

    public static void ejemploSwitchExpression() {
        // Para ser compatible con versiones comunes, lo haremos con switch normal.
        int entrada = 5;
        String valor;

        switch (entrada) {
            case 1:
                valor = "Entrada 1";
                break;
            case 2:
                valor = "Entrada 2";
                break;
            default:
                valor = "Otro valor";
                break;
        }

        System.out.println("Resultado switch (entrada): " + valor);
    }
}
