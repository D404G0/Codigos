import java.util.*;

public class listas_universidades {

    Scanner leer;
    String[] universidades;
    int[] cant_estudiantes;

    String name_u;
    int opcion, num_estudiantes, menu;

    public void inicio(){
        leer = new Scanner(System.in);

        System.out.println("1. Ordenar alfabeticamente. \n 2. Ordenar de mayor a menor \n 3. Salir:");
        menu = leer.nextInt();

        while (true){
            if (menu == 1){
                alfabeto();

            }else if (menu == 2){
                numeros();

            } else if (menu == 3) {
                break;

            }
        }


        System.out.println("Ingreso la cantidad de universidades para registrar: ");
        opcion = leer.nextInt();

        universidades = new String[opcion];
        cant_estudiantes = new int[opcion];

        for (int f = 0; f < opcion; f++){
            System.out.println("Ingrese universidad #" + f);
            universidades[f] = leer.next();

            System.out.println("Ingrese la cantidad de estudiantes de la universidad #" + f);
            cant_estudiantes[f] = leer.nextInt();
        }
    }

    public void alfabeto(){
        for(int i=0; i < opcion; i++){
            for(int j=0;j<opcion-1;j++){
                if(universidades[j].compareTo(universidades[j+1]) > 0){

                    int temporaryInt = cant_estudiantes[j];
                    String temporaryString = universidades[j];

                    cant_estudiantes[j]=cant_estudiantes[j+1];
                    universidades[j]=universidades[j+1];

                    cant_estudiantes[j+1] = temporaryInt;
                    universidades[j+1] = temporaryString;
                }
            }
        }
    }

    public void numeros(){
        for(int i=0;i<opcion;i++){
            for(int j=0;j<opcion-1;j++){

                if(cant_estudiantes[j] < cant_estudiantes[j+1]){

                    int temporaryInt = cant_estudiantes[j];
                    String temporaryString = universidades[j];

                    cant_estudiantes[j]=cant_estudiantes[j+1];
                    universidades[j]=universidades[j+1];

                    cant_estudiantes[j+1] = temporaryInt;
                    universidades[j+1] = temporaryString;
                }
            }
        }
    }


    public static void main(String[] args){
        listas_universidades llamar = new listas_universidades();

        llamar.inicio();
        llamar.alfabeto();
        llamar.numeros();
    }
}
