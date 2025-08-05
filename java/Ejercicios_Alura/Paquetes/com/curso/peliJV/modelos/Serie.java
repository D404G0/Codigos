//Importacion de librerias
package com.curso.peliJV.modelos;
import com.curso.peliJV.modelos.Titulo;

public class Serie extends Titulo{
    //Declaracion de tipos de variables
    int temporadas, episodios, minutos;

    @Override
    public int get_Duracion(){
        return temporadas * episodios * minutos;
    }

    //Encapsulamiento de get
    public int get_Temporadas(){
        return temporadas;
    }

    public int get_Episodios(){
        return episodios;
    }

    public int get_Minutos(){
        return minutos;
    }

    //Encapsulamiento de set
    public void set_Temporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public void set_Episodios(int episodios){
        this.episodios = episodios;
    }

    public void set_Minutos(int minutos){
        this.minutos = minutos;
    }

}
