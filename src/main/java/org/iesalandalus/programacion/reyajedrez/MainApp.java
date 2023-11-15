package org.iesalandalus.programacion.reyajedrez;

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


    public static void main(String[] args) {



    }
}
