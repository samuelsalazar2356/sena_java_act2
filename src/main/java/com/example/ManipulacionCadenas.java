package com.example;

public class ManipulacionCadenas {
    public static void demostrarConcatenacion() {
        String a = "Hola";
        String b = "Java";
        String c = a + " " + b;

        System.out.println(c);
    }

    public static void demostrarMetodosUtiles() {
        String frase = "   Programacion   Java   ";

        String sinEspacios = frase.trim();
        String reemplazo = sinEspacios.replace("Java", "Mundo Java");
        String[] palabras = reemplazo.split("\\s+");

        System.out.println("Original: [" + frase + "]");
        System.out.println("trim: [" + sinEspacios + "]");
        System.out.println("reemplazo: " + reemplazo);

        System.out.println("Palabras:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }

    public static void demostrarInmutabilidad() {
        String texto1 = "Hola";
        String texto2 = texto1;

        texto1 = texto1 + " Mundo";

        System.out.println("texto2 (original): " + texto2);
        System.out.println("texto1 (modificado): " + texto1);

        System.out.println("¿Misma referencia? " + (texto1 == texto2));
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder();

        sb.append("Este es un párrafo muy largo.");
        sb.append(" Lo construimos con StringBuilder.");
        sb.append(" Funciona mejor para muchas concatenaciones.");

        System.out.println(sb.toString());
    }
}
