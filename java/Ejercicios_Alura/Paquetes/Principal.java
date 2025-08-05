//Importacion de todas las librerias

import com.curso.peliJV.calculos.Recomendacion;
import com.curso.peliJV.modelos.Episodio;
import com.curso.peliJV.modelos.Pelicula;
import com.curso.peliJV.modelos.Titulo;
import com.curso.peliJV.modelos.Serie;
import com.curso.peliJV.calculos.Calculadora;

import java.util.*;

//Inicio de clase
public class Principal {

    //Clase main
    public static void main (String[] args){

        Recomendacion recomendacion = new Recomendacion();
        Episodio episodio = new Episodio();

        //Declaracion de objetos usando los atributos del otro paquete 1
        Pelicula primera_pelicula = new Pelicula();

        primera_pelicula.set_Nombre("harry Potter");
        primera_pelicula.set_Lanzamiento(2000);
        primera_pelicula.set_Duracion(120);
        primera_pelicula.set_Incluido(true);


        primera_pelicula.calificacion(10);
        primera_pelicula.calificacion(10);
        primera_pelicula.calificacion(7.5);

        primera_pelicula.Informacion();
        System.out.println(primera_pelicula.getTotal_ev());
        System.out.println(primera_pelicula.media());
        recomendacion.filtro(primera_pelicula);


        //Declaracion de objetos usando los atributos del otro paquete 1
        Serie Stranger = new Serie();
        Stranger.set_Nombre("Stranger Things");
        Stranger.set_Lanzamiento(2020);
        Stranger.set_Incluido(true);

        Stranger.calificacion(5);
        Stranger.calificacion(5);
        Stranger.calificacion(8.5);

        Stranger.set_Temporadas(4);
        Stranger.set_Episodios(40);
        Stranger.set_Minutos(60);
        Stranger.Informacion();
        System.out.println("Duracion de la serie: " + Stranger.get_Duracion());
        episodio.set_Numero(1);
        episodio.set_Nombre("Cosas raras");
        episodio.set_Serie(Stranger);
        episodio.set_Visualizaciones(300);


        recomendacion.filtro(episodio);

        System.out.println("-".repeat(20));
        Calculadora calculadora = new Calculadora();
        calculadora.incluye(primera_pelicula);
        calculadora.incluye(Stranger);
        System.out.println("Duracion total de maraton : " + calculadora.get_tiempo_total());
    }
}
