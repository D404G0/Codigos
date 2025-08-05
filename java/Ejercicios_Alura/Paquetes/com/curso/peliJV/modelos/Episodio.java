package com.curso.peliJV.modelos;

import com.curso.peliJV.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero, visualizaciones;
    private String nombre;
    private Serie serie;

    //Getter
    public int get_Numero(){
        return numero;
    }

    public String get_Nombre(){
        return nombre;
    }

    public Serie serie(){
        return serie;
    }

    public int set_Visualizaciones(){
        return visualizaciones;
    }

    //Setter
    public void set_Numero(int numero){
        this.numero = numero;
    }

    public void set_Nombre(String nombre){
        this.nombre = nombre;
    }

    public void set_Serie(Serie serie){
        this.serie = serie;
    }

    public void set_Visualizaciones(int visualizaciones){
        this.visualizaciones = visualizaciones;
    }

    @Override
    public int get_Clasificacion(){
        if (visualizaciones > 100){
            return 4;

        }else {
            return 2;
        }
    }
}
