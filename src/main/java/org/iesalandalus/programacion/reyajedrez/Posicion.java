package org.iesalandalus.programacion.reyajedrez;

public class Posicion {
    private int fila;
    private char columna;

    public void setFila(int fila) {
        if (fila>8)
            throw new IllegalArgumentException("La fila no puede ser mayor que 8");
        else if (fila < 1)
            throw new IllegalArgumentException("La fila no puede ser menor que 1");
        else
            this.fila = fila;
    }

    public void setColumna(char columna) {
        if (columna > 'h')
            throw new IllegalArgumentException("La columna no puede ser mayor que 8");
        else if (columna < 'a')
            throw new IllegalArgumentException("La columna no puede ser menor que 1");
        else
            this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public char getColumna() {
        return columna;
    }


}
