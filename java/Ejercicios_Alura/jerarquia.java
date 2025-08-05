import java.util.*;

public class jerarquia {
    int numero1, numero2, numero3, mayor;
    Scanner leer;


    public void inicio(){
        leer = new Scanner(System.in);

        System.out.println("Ingrese su primer número: ");
        numero1 = leer.nextInt();

        System.out.println("Ingrese su segundo número: ");
        numero2 = leer.nextInt();

        System.out.println("Ingrese su tercer número: ");
        numero3 = leer.nextInt();
    }

    public void validacion(){
        if (numero1 > numero2 && numero1 > numero3){
            mayor = numero1;

        }else if (numero2 > numero1 && numero2 > numero3 ){
            mayor = numero2;

        }else if (numero3 > numero1 && numero3 > numero2){
            mayor = numero3;
        }else{
            System.out.println("Esto no debe salir");
        }
    }

    public void finalizacion(){
        System.out.println("El número mayor de: " + numero1 + ", " + numero2 + ", " + numero3 + "," + " es " + mayor);
    }

    public static void main(String[] args){
        jerarquia llamar;

        llamar = new jerarquia();

        llamar.inicio();
        llamar.validacion();
        llamar.finalizacion();
    }

}
