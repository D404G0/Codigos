import java.util.*;

public class desafio1 {

    public static void main(String[] args){
        int random, contador, valor, intentos;
        Scanner teclado = new Scanner(System.in);

        random = new Random().nextInt(100);
        contador = 0;
        intentos = 5;

        System.out.println("Adivina el número.");
        System.out.println("""
                1. Número secreto en el rago de 1 a 100.
                2. 5 intentos para validar el numero secreto
                """);

        System.out.println(random);

        for (int i = 0; i < intentos; i++){
            System.out.println("Ingrese su numero:");
            valor = teclado.nextInt();

            if (valor == random){
                System.out.println("Correcto: " + valor + " era el numero secreto" );
                break;

            }else if (valor > random){
                System.out.println("El numero secreto es menor.");
                contador += 1;
                System.out.println("Te quedan " + (intentos - contador) + " intentos.");

            }else if (valor < random){
                System.out.println("El numero secreto es mayor");
                contador += 1;
                System.out.println("Te quedan " + (intentos - contador) + " intentos");

            }
        }
        System.out.println("El numero secreto era " + random);

    }
}
