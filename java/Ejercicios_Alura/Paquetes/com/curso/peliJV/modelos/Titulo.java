package com.curso.peliJV.modelos;
import java.util.*;

public class Titulo {

    //Decalracion de atributos
    private String nombre;
    private int lanzamiento, duracion;
    private boolean incluido;
    private double suma;
    private int total_ev;

    //Encapsulamiento de get
    public String get_Nombre(){
        return nombre;
    }

    public int get_Lanzamiento(){
        return lanzamiento;
    }

    public int get_Duracion(){
        return duracion;
    }

    public boolean is_Incluido(){
        return incluido;
    }

    public int getTotal_ev(){
        return total_ev;
    }

    //Encapsulamiento de set
    public void set_Nombre(String nombre) {
        this.nombre = nombre;
    }

    public void set_Lanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public void set_Duracion(int duracion) {
        this.duracion = duracion;
    }

    public void set_Incluido(boolean incluido) {
        this.incluido = incluido;
    }

    public void setTotal_ev(int total_ev) {
        this.total_ev = total_ev;
    }

    //Objeto de informacion de pelicula
    public void Informacion(){
        System.out.println("-".repeat(20));
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media());
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de lanzamiento: " + lanzamiento);
        System.out.println("Duracion en minutos: " + get_Duracion());
        System.out.println("Incluido: " + incluido);

    }

    //Clase de mostrar informacion de la pelicula con un input
    public void calificacion(double nota){
        suma += nota;
        total_ev ++;
    }

    //Clase de calcular media
    public double media(){
        return suma / total_ev;
    }
}
