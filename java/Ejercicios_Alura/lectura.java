import java.util. *;

public class lectura {
    public static void main(String[] args) {
        //Declaracion de variables
        String pelicula,  star;
        int lanzamiento, valoracion, contador;
        double puntuacion;
        contador = 0;
        star = "⭐";

        //Metodo de input
        System.out.println();
        Scanner teclado = new Scanner(System.in);

        //Input de nombre
        System.out.println("Ingrese el nombre de la pelicula:");
        pelicula = teclado.nextLine();

        //Input de fecha
        System.out.println("Ingrese fecha de lanzamiento: ");
        lanzamiento = teclado.nextInt();

        //Input de valoracion
        System.out.println("Ingrese su valoracion: ");
        puntuacion= teclado.nextDouble();

        //Input de estrellas
        System.out.println("Ingrese las estrellas para esta pelicula: ");
        valoracion = teclado.nextInt();

        //Output de informacion
        System.out.println("Informacion de la pelicula.");
        System.out.println("-".repeat(10));
        System.out.println("Nombre: " + pelicula);
        System.out.println("Fecha de lanzamiento: " + lanzamiento);
        System.out.println("Puntuacion: " + puntuacion);

        if (valoracion == 0){
            System.out.println("Estrellas: Ninguna");

        }else{
            //Bucle para imprimir n valores de string
            for (int i = 0;contador <= valoracion; i++){

                //Condicion para saber cuantas estrrellas imprimir validando que sea igual que el contador
                if (valoracion == i){
                    System.out.println("Estrellas: " + star.repeat(valoracion));

                }else {
                    //sumatoria de un valor al contador
                    contador += 1;
                }
            }
        }
        System.out.println("-".repeat(10));
    }
}
