import java.util.*;

public class temperaturas_t {
    public static void main(String[] args){
        int opcion;
        float valor;
        Scanner leer = new Scanner(System.in);

        while (true){
            System.out.println("Menu");
            System.out.println("1. Convertir Celcius a Fahrenheit. ");
            System.out.println("2. Convertir Fahrenheit a Celcius. ");
            System.out.println("3. Salir");

            System.out.println("Ingrese una opcion:");
            opcion = leer.nextInt();

            if (opcion == 1){
                System.out.println("Ingrese el valor a convertir:");
                valor = leer.nextFloat();

                System.out.println((valor * 9/5 + 32) + "F");

            }else if (opcion == 2){
                System.out.println("Ingrese el valor a convertir:");
                valor = leer.nextFloat();

                System.out.println((valor-32)*5/9 + "C");

            }else if (opcion == 3){
                System.out.println("Saliendo...");
                break;

            }else{
                System.out.println("Dato no valido, intentelo neuvamente.");
            }
        }
    }
}
