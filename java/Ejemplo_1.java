//Importar librerias
import java.util.*;

//Creacion de clases
public class Ejemplo_1 {
    //Atributos
    String color, marca;
    int precio;

    //Metodo
    public static void main(String[] args){
        Ejemplo_1 carro_1 = new Ejemplo_1();
        carro_1.color = "Morado";
        carro_1.marca = "Tesla";
        carro_1.precio = 1000000;

        System.out.println("El color del carro es: " + carro_1.color);
        System.out.println("La marca del carro es: " + carro_1.marca);
        System.out.println("El precio del carro es: " + carro_1.precio);
    }
}
