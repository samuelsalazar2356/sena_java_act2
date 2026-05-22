package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostrarEnteros() {
        System.out.println("byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
    }

    public static void demostrarFlotantes() {
        float precioCafeFloat = 3500.50f;
        double precioCafeDouble = 3500.50;

        System.out.println("Precio café (float): " + precioCafeFloat);
        System.out.println("Precio café (double): " + precioCafeDouble);
    }

    public static void demostrarCaracteres() {
        char inicial = 'V';
        System.out.println("Inicial: " + inicial);
    }

    public static void demostrarBooleanos() {
        boolean luzEncendida = true;
        System.out.println("Luz encendida: " + luzEncendida);

        boolean luzApagada = false;
        System.out.println("Luz apagada: " + luzApagada);
    }

    public static void demostrarValoresPorDefecto() {

        class Demo {
            byte b;
            short s;
            int i;
            long l;
            float f;
            double d;
            char c;
            boolean bo;
        }

        Demo demo = new Demo();
        System.out.println("Valores por defecto (campo):");
        System.out.println("byte: " + demo.b);
        System.out.println("short: " + demo.s);
        System.out.println("int: " + demo.i);
        System.out.println("long: " + demo.l);
        System.out.println("float: " + demo.f);
        System.out.println("double: " + demo.d);
        System.out.println("char: " + demo.c);
        System.out.println("boolean: " + demo.bo);
    }
}
