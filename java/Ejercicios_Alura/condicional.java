import java.util.*;

public class condicional {
    public static void main(String[] args){
        int numero, i;
        i = 1;

        //input
        Scanner teclado = new Scanner(System.in);

        //mensaje para ingresar numero
        System.out.println("Ingrese su numero");

        //declarar input = numero
        numero = teclado.nextInt();

        //bucle for
        /*
        for (int i = 1; i <= numero; i++){

            System.out.println(numero + "*" + i + "=" + (numero * i));
        }
        */

        //bucle do while
        do{
            System.out.println(numero + "*" + i + "=" + (numero * i));
            i++;
        }while(i <= numero);

        /*
        //bucle while
        while(i <= numero){
            System.out.println(numero + "*" + i + "=" + (numero * i));
            i++;
        }
         */
    }
}
