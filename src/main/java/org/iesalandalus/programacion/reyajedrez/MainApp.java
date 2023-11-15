package org.iesalandalus.programacion.reyajedrez;

import javax.naming.OperationNotSupportedException;

public class MainApp {
    Rey rey;
    private void ejecutarOpcion(int opcion){
        switch (opcion){
            case 1 -> crearReyDefecto();
            case 2 -> crearReyColor();
        }
    }

    private void crearReyDefecto(){
        rey = new Rey();
    }

    private void crearReyColor(){
        switch (Consola.elegirOpcion()){
            case 1-> rey = new Rey(Color.BLANCO);
            case 2-> rey = new Rey(Color.NEGRO);
        };
    }

    private void mover(){
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
        } catch (OperationNotSupportedException | NullPointerException e){
            System.out.println(e.getMessage());
        }


    }


    public static void main(String[] args) {



    }
}
