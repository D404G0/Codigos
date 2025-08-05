import java.util.*;

public class multiplicar {
    int numero, resultado;
    Scanner leer;

    public void inicio(){
        leer = new Scanner(System.in);

        System.out.println("Ingrese un numero mayor a 0 y menor o igual a 10: ");
        numero = leer.nextInt();
    }

    public void validacion(){
        while (true){
            if (numero == 0){
                inicio();
            }else if(numero > 10){
                inicio();
            }else if(numero > 0 && numero <= 10){
                operacion();
                break;
            }else{
                inicio();
            }
        }


    }

    public void operacion(){
        System.out.println("Tabla del número " + numero);
        for (int i = 1; i <= 10; i++){

            resultado = numero * i;
            System.out.println(i + " * " + numero + " = " + resultado);
        }

    }

    public static void main(String[] args){
        multiplicar llamar;

        llamar = new multiplicar();

        llamar.inicio();

        llamar.validacion();

        llamar.operacion();
    }
}
