//herencia
import java.util. *;

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
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
    }
}

//subclase que hereda
class estudiante extends persona{
    String uni, carrera;
    
    //constructor estudiante
    public estudiante(String nombre, int edad, String uni, String carrera){
        super(nombre, edad); 
        this.uni = uni;
        this.carrera = carrera;
    }
    
    public void mostrar_uni(){
        System.out.println("Universidad: " + uni);
        System.out.println("Carrera: " + carrera);
    }
}


class Main{
    public static void main(String[] args){
        System.out.println("Herencia");
        
        estudiante estu = new estudiante("Karol", 19, "Universidad Los Libertadores", "Hoteleria y turismo");
        
        estudiante estu_dos = new estudiante("Diego", 19, "Universidad Libre", "Ingenieria en sistemas");
        
        estu.mostrar();
        estu.mostrar_uni();
        
        System.out.println(" ");
        
        estu_dos.mostrar();
        estu_dos.mostrar_uni();
        
    }
}
