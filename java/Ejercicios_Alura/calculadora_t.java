import java.util.*;

public class calculadora_t {
    int num1, num2, opcion;
    Scanner input;

    public void inicio(){
        Scanner input = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("-----------------------------");

        System.out.println("Ingrese el numero de identificacion de la operacion que desea hacer: ");
        opcion = input.nextInt();

        System.out.println("Ingrese su primer numero: ");
        num1 = input.nextInt();

        System.out.println("Ingrese su segundo numero: ");
        num2 = input.nextInt();
    }

    public void validacion(){
        if (opcion == 1){
            System.out.println("La suma de sus numeros es:" + (num1 + num2));

        }else if (opcion == 2){
            System.out.println("La resta de sus numeros es:" + (num1 - num2));

        }else if (opcion == 3){
            System.out.println("La multiplicacion de sus numeros es:" + (num1 * num2));

        }else if (opcion == 4){

            if (num1 == 0 || num2 == 0){
                System.out.println("No se puede dividir por cero");

            }else{
                System.out.println("La division de sus numeros es:" + (num1 / num2));

            }
        }
    }

    public static void main (String[] args){
        contador_t iniciar;
        iniciar = new contador_t();

        iniciar.inicio();
        iniciar.validacion();

    }
}