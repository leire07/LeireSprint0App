package org.example.lvilmar1.leireapp.logicaFake;

//
// Medicion
// Leire Villarroya Martínez
//18/10/21
// Pojo para el objeto Medicion
//
public class Medicion {
    private int medicion;
    private double latitud;
    private double longitud;


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
