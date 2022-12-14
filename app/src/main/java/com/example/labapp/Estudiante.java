package com.example.labapp;

public class Estudiante {
    int id;
    String nombre;
    double promedio;

    @Override
    public String toString() {
        return id + " - " + String.format("%,.2f", promedio) + " - " + nombre; //Retorna un String con formato para la lista
    }

    public Estudiante(int id, String nombre, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
    }
}
