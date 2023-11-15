package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

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

        do {
            System.out.print("Introduzca elección (1-4): ");
            opcion = Entrada.entero();
        } while (opcion < 1 || opcion > 4);

        return opcion;
    }

    public static int elegirOpcion(){
        int opcion;

        System.out.println("====");
        System.out.println("1. Blanco");
        System.out.println("2. Negro");
        System.out.println("====");

        do{
            System.out.println("Elegir opción para el color (1-2)");
            opcion = Entrada.entero();
        } while (opcion < 1 || opcion > 2);

        return opcion;
    }

    public static void mostrarMenuDirecciones(){
        System.out.println("====");
        System.out.println("8. NO   1. N    2. NE");
        System.out.println("7. O     XX     3. E");
        System.out.println("6. SO   5. S    4. SE");
        System.out.println("\n 9. Enroque corto.");
        System.out.println("10. Enroque largo.");
    }

    public static int elegirDireccion(){
        int opcion;

        System.out.println("====");

        do{
            System.out.print("Introduzca movimiento (1-10): ");
            opcion = Entrada.entero();
        } while (opcion < 1 || opcion > 10);

        return opcion;
    }

    public static void despedirse(){
        System.out.println("Saliendo...");
    }


}
