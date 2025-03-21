//herencia
import java.util: *;

//super clase
class persona{
    String nombre;
    int edad;
    
    //constructor
    public persona(String nombre, int edad){
        
        // this objeta actual donde esta el codigo
        //   atributo super clase = atributo del constrcutor
        this.nombre = nombre;  
        this.edad = edad;
    }
    
    //Método para mostrar informacion
    public void mostrar(){
        System.out.println("Nombre " + nombre)
        System.out.println("edad " + edad)
    }
}

//subclase que hereda
class estudiante extends persona{
    String uni;
    
    //constructor estudiante
    public estudiante(String nombre, uni; int edad){
        super(nombre, edad); 
        this.uni = uni;
    }
    
    public void mostrar_uni(){
        System.out.println("Universidad" + uni);
    }
}

class Main{
    public class void main(String[] args){
        
    }
}

 