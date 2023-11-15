package org.iesalandalus.programacion.reyajedrez;

import javax.naming.OperationNotSupportedException;

public class Rey {

    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    public Rey() {
        color = Color.BLANCO;
        posicion = new Posicion(1,'e');
        totalMovimientos = 0;
    }

    public Rey(Color color) throws NullPointerException{
        this();
        if (color == null)
            throw new NullPointerException("ERROR: El color no puede ser nulo.");
        if (color == Color.NEGRO) {
            posicion = new Posicion(8, 'e');  //quizás el new no sea necesario porque viene con el this().
            this.color = Color.NEGRO;
        }
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

    private boolean comprobarEnroque() throws OperationNotSupportedException{

        if (this.color== Color.BLANCO && (posicion.getColumna() != 'e' || posicion.getFila() != 1))
            throw new OperationNotSupportedException("ERROR: El rey no está en su posición inicial.");
        else if (this.color== Color.NEGRO && (posicion.getColumna() != 'e' || posicion.getFila() != 8))
            throw new OperationNotSupportedException("ERROR: El rey no está en su posición inicial.");
        else if (getTotalMovimientos() != 0)
            throw new OperationNotSupportedException("ERROR: El rey ya se ha movido antes.");

        return true;
    }

    @Override
    public String toString() {
        return "color=" + color + ", posicion=(" + posicion + ")";
    }

    public void mover(Direccion direccion) throws NullPointerException, OperationNotSupportedException {
        try{
            if (direccion == null)
                throw new NullPointerException("ERROR: La dirección no puede ser nula.");
            else {
                switch (direccion) {
                    case NORTE -> posicion = new Posicion(posicion.getFila() + 1, posicion.getColumna());
                    case NORESTE -> posicion = new Posicion(posicion.getFila() + 1, (char) (posicion.getColumna() + 1));
                    case ESTE -> posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() + 1));
                    case SURESTE -> posicion = new Posicion(posicion.getFila() - 1, (char) (posicion.getColumna() + 1));
                    case SUR -> posicion = new Posicion(posicion.getFila() - 1, posicion.getColumna());
                    case SUROESTE -> posicion = new Posicion(posicion.getFila() - 1, (char) (posicion.getColumna() - 1));
                    case OESTE -> posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() - 1));
                    case NOROESTE -> posicion = new Posicion(posicion.getFila() + 1, (char) (posicion.getColumna() - 1));
                    case ENROQUE_CORTO -> {
                        if (comprobarEnroque())
                            posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() + 2));
                    }
                    case ENROQUE_LARGO -> {
                        if (comprobarEnroque())
                            posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() - 2));
                    }
                }
            }
        }catch (IllegalArgumentException e) {
            throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
        }
            setTotalMovimientos(getTotalMovimientos()+1);
    }
}
