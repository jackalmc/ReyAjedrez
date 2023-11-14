package org.iesalandalus.programacion.reyajedrez;

public enum Color {
    BLANCO("Blanco"), NEGRO("Negro");

    private String cadenaAMostrar;

    private Color(String cadenaAMostrar) {

    }
    @Override
    public String toString() {
        return "Color{" +
                "cadenaAMostrar='" + cadenaAMostrar + '\'' +
                '}';
    }


}
