package org.example.lvilmar1.leireapp.logicaFake;

public class Medicion {
    private int medicion;
    private double latitud;
    private double longitud;
    private double major;
    private double minor;


    public Medicion(int medicion, double latitud, double longitud, int major, int minor) {
        this.medicion = medicion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.major = major;
        this.minor = minor;
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
    public double getMajor() {
        return major;
    }
    public double getMinor() {
        return minor;
    }
}
