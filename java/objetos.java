import java.util.*;

class Main {
    
    //Atributo clase
    String nombre;
    int edad;
    Scanner leer;
    
    //Metodo inicial
    public void iniciar(){
        leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();
    }
    
    public void secuencia(){
        if (edad >= 18){
            System.out.println(nombre + " usted es mayor de edad.");
        }else{
            System.out.println(nombre + " usted es menor de edad.");
        }
    }
    
    public void mostrar(){
        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);
    }
    
    public static void main(String[] args) {
        //Definir objeto
        Main uno; 
        
        //Crear objeto de la clase
        uno = new Main();
        
        //Llamar metodo
        uno.iniciar();
        
        //Llamar metodo
        uno.secuencia();
        
        //Llamar metodo
        uno.mostrar();
    }
}