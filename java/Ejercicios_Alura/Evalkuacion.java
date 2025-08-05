import java.util.*;

public class Evalkuacion {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double nota, media, total;

        nota = 0;
        media = 0;
        total = 0;

        while (nota != -1 ){
            System.out.println("Escribe su puntuacion de la pelicula;");
            nota = teclado.nextDouble();

            if (nota != -1 ){
                media += nota;
                total += 1;
            }


        System.out.println("Media de evaluacion para la pelicula es: " + media/total );
        }
    }
}
