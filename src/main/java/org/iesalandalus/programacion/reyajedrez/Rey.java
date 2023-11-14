package org.iesalandalus.programacion.reyajedrez;

public class Rey {

    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    public Rey() {
        color = Color.BLANCO;
        posicion = new Posicion(1,'e');
        totalMovimientos = 0;
    }

    public Rey(Color color){
        this();
        if (color == Color.BLANCO)
            posicion = new Posicion(1, 'e');
        else
            posicion = new Posicion(8,'e');
    }

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
