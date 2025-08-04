//Importar librerias
import java.util.*;

//Clases
public class Clases_objetos {
    String titulo, autor_a;
    int paginas;

    //Constructor

    public Clases_objetos(){

    }

    public void mostrar(){
        System.out.println("Nombre del libro: " + titulo);
        System.out.println("Nombre del autor/a: " + autor_a);
        System.out.println("Numero de paginas: " + paginas);
    }
}

class Clases_objetos{
    public static void main(String[] args){
        System.out.println("Primer ejercicio");

        Clases_objetos libro = new Clases_objetos();


    }
}
