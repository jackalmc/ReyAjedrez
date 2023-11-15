package org.iesalandalus.programacion.reyajedrez;

import java.util.Objects;

public class Posicion {
    private int fila;
    private char columna;

    public Posicion(int fila, char columna){
        setFila(fila);
        setColumna(columna);
    }
    public Posicion(Posicion posicion){
        if (posicion==null)
            throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
        setFila(posicion.getFila());
        setColumna(posicion.getColumna());
    }

    private void setFila(int fila) throws IllegalArgumentException{
        if (fila>8 || fila <1)
            throw new IllegalArgumentException("ERROR: Fila no válida.");
        else
            this.fila = fila;
    }

    private void setColumna(char columna) throws IllegalArgumentException {
        if (columna > 'h' || columna < 'a')
            throw new IllegalArgumentException("ERROR: Columna no válida.");
        else
            this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public char getColumna() {
        return columna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    @Override
    public String toString() {
        return  "fila=" + fila + ", columna=" + columna;
    }
}
