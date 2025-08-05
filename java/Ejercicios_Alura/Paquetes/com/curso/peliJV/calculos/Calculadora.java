package com.curso.peliJV.calculos;
import com.curso.peliJV.modelos.Pelicula;
import com.curso.peliJV.modelos.Serie;
import com.curso.peliJV.modelos.Titulo;

import java.util.*;

public class Calculadora {
    private int tiempo_total;

    public int get_tiempo_total(){
        return tiempo_total;
    }

    public void incluye(Titulo titulo){
        this.tiempo_total += titulo.get_Duracion();
    }
}
