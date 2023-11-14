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
        setFila(posicion.getFila());
        setColumna(posicion.getColumna());
    }

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
            throw new IllegalArgumentException("La columna no puede ser mayor que h");
        else if (columna < 'a')
            throw new IllegalArgumentException("La columna no puede ser menor que a");
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
        return  "(Fila=" + fila + ", Columna=" + columna + ')';
    }
}
