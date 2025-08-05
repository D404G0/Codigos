package com.curso.peliJV.calculos;

public class Recomendacion {

    public void filtro(Clasificacion clasificacion){
        if (clasificacion.get_Clasificacion() >= 4){
            System.out.println("Buena evaluacion en el momento");

        }else if (clasificacion.get_Clasificacion() >= 2){
            System.out.println("Popular en el momento.");

        }else {
            System.out.println("Añadir a Ver mas tarde");
        }
    }
}
