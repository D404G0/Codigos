package com.curso.peliJV.principal;

import java.util.*;
import com.curso.peliJV.modelos.Pelicula;
import com.curso.peliJV.modelos.Serie;
import com.curso.peliJV.modelos.Titulo;

import java.util.Collection;

public class Listas {
    public static void main(String[] args){

        Pelicula primera_pelicula = new Pelicula("harry Potter", 2000);
        primera_pelicula.calificacion(9);

        Serie Stranger = new Serie("Stranger Things", 2020);
        Stranger.calificacion(10);

        var terminator = new Pelicula("Terminator.", 2000);
        terminator.calificacion(4);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(primera_pelicula);
        lista.add(terminator);
        lista.add(Stranger);

        for (Titulo item: lista){
            System.out.println(item.get_Nombre());
            if (item instanceof Pelicula pelicula && pelicula.get_Clasificacion() > 2 ){
                System.out.println(pelicula.get_Clasificacion());
            }
        }

        ArrayList<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Ryan renolds");
        listaArtistas.add("Millie");
        listaArtistas.add("Chespirito");

        System.out.println("Lista de artistas no ordenada: " + listaArtistas);
        Collections.sort(listaArtistas);
        System.out.println("Lista de artistas ordenada: " + listaArtistas);

        System.out.println(lista);
        System.out.println("Lista de titulos ordenados: " + lista);

    }
}
