package org.iesalandalus.programacion.reyajedrez;

import javax.naming.OperationNotSupportedException;

public class MainApp {
    static Rey rey;
    static boolean salir=false;

    private static void ejecutarOpcion(int opcion){
        switch (opcion){
            case 1 -> crearReyDefecto();
            case 2 -> crearReyColor();
            case 3 -> mover();
            case 4 -> salir = true;
        }
    }

    private static void crearReyDefecto(){
        rey = new Rey();
    }

    private static void crearReyColor(){
        switch (Consola.elegirOpcion()){
            case 1-> rey = new Rey(Color.BLANCO);
            case 2-> rey = new Rey(Color.NEGRO);
        }
    }

    private static void mover(){
        Consola.mostrarMenuDirecciones();
        try{
            switch(Consola.elegirDireccion()){
                case 1 -> rey.mover(Direccion.NORTE);
                case 2 -> rey.mover(Direccion.NORESTE);
                case 3 -> rey.mover(Direccion.ESTE);
                case 4 -> rey.mover(Direccion.SURESTE);
                case 5 -> rey.mover(Direccion.SUR);
                case 6 -> rey.mover(Direccion.SUROESTE);
                case 7 -> rey.mover(Direccion.OESTE);
                case 8 -> rey.mover(Direccion.NOROESTE);
                case 9 -> rey.mover(Direccion.ENROQUE_CORTO);
                case 10 -> rey.mover(Direccion.ENROQUE_LARGO);
            }
        } catch (OperationNotSupportedException | NullPointerException | IllegalArgumentException e){
            System.out.println("====");
            System.out.println(e.getMessage());
        }
    }

    private static void mostrarRey(){
        System.out.println("====");
        if (rey != null)
            System.out.println(rey);
        else
            System.out.println("El rey no ha sido creado aún.");
        System.out.println("====");
    }


    public static void main(String[] args) {

        do{
            mostrarRey();
            Consola.mostrarMenu();
            ejecutarOpcion(Consola.elegirOpcionMenu());
        } while (!salir);

        Consola.despedirse();


    }
}
