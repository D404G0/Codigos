package com.curso.peliJV.modelos;
import com.curso.peliJV.modelos.Titulo;
import com.curso.peliJV.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion{
    private String director;

    public Pelicula(String nombre, int lanzamiento) {
        super(nombre, lanzamiento);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int get_Clasificacion() {
        return (int) media() / 2;
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.get_Nombre() + " (" + get_Lanzamiento() + ")";
    }
}
