import java.lang.Object;
public class Notas {
    public static void main(String[] args){


        // Comparacion de contenido en string

        String nombre, mensaje;
        int edad, aulas;
        double valor;

        nombre = "Diego";
        edad = 19;
        valor = 3.1416;

        System.out.println(String.format("Mi nombre es %s, tengo %d anos y hoy gaste %.2f dolares", nombre, edad, valor));

        aulas = 4;
        mensaje = """
                Hola, %s!
                Bienvenido al curso de java.
                Tendremos %d aulas para mostrar lo necesario para aprender
                """.formatted(nombre, aulas);

        System.out.println(mensaje);

        /*
        int x = 10;
        double y = x; // casting implícito

        double x = 10.5;
        int y = (int) x; // casting explícito

        if (nombre.equals("Diego")) {
            System.out.println("Su nombre coincide");

        }else{
            System.out.println("Su nombre no coincide.");
        }
        */

        /*
        switch (expresion) {
            case valor1:
                // código a ejecutar si la expresión es igual a valor1
                break;

            case valor2:
                // código a ejecutar si la expresión es igual a valor2
                break;

                // otros casos posibles...
            default:
                // código a ejecutar si ninguno de los casos anteriores se cumple
        }


        int dia = 3;
            switch (dia) {
              case 1:
                System.out.println("El día 1 es lunes");
                break;
              case 2:
                System.out.println("El día 2 es martes");
                break;
              case 3:
                System.out.println("El día 3 es miércoles");
                break;
              // otros casos posibles...
              default:
                System.out.println("Día no válido");
            }
         */

    }
}



