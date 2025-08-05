import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int edad;
	    String nombre;
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Ingrese su nombre");
	    nombre = teclado.nextLine();
	    
	    System.out.println("Ingrese su edad");
	    edad = teclado.nextInt();
	    
	    if (edad >= 18){
	        System.out.println(nombre + " Es mayor de edad.");
	    } else{
	        System.out.println(nombre + " Es menor de edad.");
	    }
	    
	    /*
	    System.out.println("Su nombre es " + edad + " y su edad es " + nombre);
	    */
	    
	}
}
 