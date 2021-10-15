package org.example.lvilmar1.leireapp.logicaFake;

public class Medicion {
    private int medicion;
    public double latitud;
    public double longitud;

    public Medicion(int medicion, double latitud, double longitud) {
        this.medicion = medicion;
        this.latitud = latitud;
        this.longitud = longitud;
    }


    public int getMedicion() {
        return medicion;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }
}
