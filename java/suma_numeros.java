import java.util.*;

public class suma_numeros {
    int numero, suma = 0;
    Scanner leer;

    public void inicio(){
        leer = new Scanner(System.in);

        System.out.println("Ingrese su numero: ");
        numero = leer.nextInt();
    }

    public void proceso(){
        while (numero != 0){
            suma += numero;

            inicio();
        }
        System.out.println("La suma de todos los numeros que ingreso es; " + suma);
    }

    public static void main(String[] args){
        suma_numeros llamar;

        llamar = new suma_numeros();

        llamar.inicio();

        llamar.proceso();
    }
}
