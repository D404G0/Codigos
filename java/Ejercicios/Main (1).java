import java.util.*; //Esto es un comentario

/*
Otro comentario 
en 3 lineas
mi socio
*/

public class Main
{
	public static void main(String[] args) {
	    int num1, num2, suma, multi; //decalracion de variables
	    
	    Scanner leer = new Scanner(System.in); //objeto de lectura
	    
	    System.out.println("Ingrese su primer numero"); //Texto de primer variable
	    num1 = leer.nextInt(); //Declaracion de primera variable
	    
	    System.out.println("Ingrese su segundo numero"); //Texto de segunda variable
	    num2 = leer.nextInt(); //Declaracion de primera variable
	    
	    /*
	    suma = num1 + num2;*/
	    multi = num1 * num2;
	    
	    /*
	    System.out.println("La suma de sus numeros es: " + suma);
	    */
	    System.out.println("La multiplicacion de sus numeros es: " + multi);
	    System.out.println("La suma es " + (num1 + num2));
	    
	}
}
 
