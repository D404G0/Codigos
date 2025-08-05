import java.util.*;

//Super clase
class animal{
    String tipo, nombre;
    int edad;

    //Constructor
    public animal(String tipo, String nombre, int edad){
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo para mostrar la infromacion
    public void mostrar(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sonido: Depende del tipo de animal");

    }
}

//subclase que hereda
class gato extends animal{
    String color;

    public gato(String tipo, String nombre, String color, int edad){
        super(tipo, nombre, edad);
        this.color = color;
    }

    @Override
    public void mostrar(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sonido: El gato maulla ¡Miau Miau!");
    }
}

//subclase que hereda
class perro extends animal{
    String raza;

    public perro(String tipo, String nombre, String raza, int edad){
        super(tipo, nombre, edad);
        this.raza = raza;
    }

    @Override
    public void mostrar(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sonido: El perro ladra ¡woff woff!");
    }
}

class animales{
    public static void main(String[] args){
        animal[] animals = {
                new perro("Perro", "Sikypper", "criollo", 5),

                new gato("Gato", "cocoa", "negro", 6)
        };

        for (animal animal : animals){
            animal.mostrar();
        }
    }
}