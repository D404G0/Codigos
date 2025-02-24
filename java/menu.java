import java.util.*;

public class menu {
    int opcion;
    Scanner leer;

    public void inicio(){
        leer = new Scanner(System.in);

        System.out.println("Ingrese una opcion para validar: ");
        opcion = leer.nextInt();
    }

    public void secuencia(){
        do{
            System.out.println("Menu");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha y hora actual");
            System.out.println("3. Salir");

            inicio();
            condicional();

        }while(opcion != 3);
    }

    public void condicional(){
        while (true){
            if (opcion == 1){
                System.out.println("Hola ciudadano del comun");
            }else if(opcion == 2){
                System.out.println("La fecha de hoy es: 23/02/2025" );
            }else if(opcion == 3){
                break;
            }
        }

    }

    public void finalizacion(){
        while (true){
            if (opcion > 3 && opcion < 1){
                System.out.println("Opcion incorrecta");
                inicio();
            }else{
                secuencia();
                break;
            }
        }
    }

    public static void main(String[] args){
        menu llamar;

        llamar = new menu();

        llamar.secuencia();
        llamar.inicio();
        llamar.finalizacion();
    }

}
