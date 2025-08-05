import java.util.*;

public class loops {

    public static void main(String[] args){

        double nota, media;

        nota = 0;
        media = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe su puntuacion de la pelicula;");
            nota = teclado.nextDouble();
            media = media + nota;
        }

        System.out.println("Media de evaluacion para la pelicula es: " + media/3 );
    }
}
