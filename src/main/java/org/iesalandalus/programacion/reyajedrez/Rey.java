package org.iesalandalus.programacion.reyajedrez;

public class Rey {

    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    public Color getColor() {
        return color;
    }

    private void setColor(Color color) {
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    private void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }

    private void setTotalMovimientos(int totalMovimientos) {
        this.totalMovimientos = totalMovimientos;
    }
}
