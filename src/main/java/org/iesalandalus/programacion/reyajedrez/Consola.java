package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.sql.SQLOutput;

public class Consola {

    public Consola(){
    }

    //Varios sout en vez de consolidar por claridad al leerlo, pero normalmente lo reduciría a una línea usando métodos de formato.
    public static void mostrarMenu(){
        System.out.println("1. Crear rey por defecto.");
        System.out.println("2. Crear rey eligiendo color.");
        System.out.println("3. Mover.");
        System.out.println("4. Salir.");
    }

    public static int elegirOpcionMenu(){
        int opcion;

        System.out.println("====");
        System.out.print("Introduzca elección (1-4): ");
        opcion = Entrada.entero();
        return opcion;
    }
}
