//constructopr
import java.util.*;
class Main{
    String nombre;
    int edad;
    public Main(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = leer new.netLine();
        
        System.out.println("Ingrese nombre: ");
        nombre = leer new.netInt();
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    public void condicion(){
        if (edad >=18 ){
            System.out.println(nombre + " es mayor de edad.");
        }else{
            System.out.println(nombre + " es menor0 de edad.");
        }
    }
    
    public static void main(String[] args){
        System.out.println("Verificar edad.");
        Main m = new Main();
        
    }
}