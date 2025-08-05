import java.util.*;

public class adivinanza_t {
    int numeroSecreto, intentosMaximos, intentos;
    Scanner input;

    public void inicio() {
        input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("El número secreto se ha generado entre 1 y 10.");

        numeroSecreto = random.nextInt(10) + 1;
        intentosMaximos = 4;
        intentos = 0;
    }

    public void validacion() {
        int numeroUsuario;

        do {
            intentos++;

            System.out.print("Intento " + intentos + "/" + intentosMaximos + " - Ingresa un número entre 1 y 10: ");
            numeroUsuario = input.nextInt();

            if (numeroUsuario == numeroSecreto) {
                System.out.println("¡Acertaste! El número secreto era: " + numeroUsuario + ". Intentos utilizados: " + intentos);
                break;

            } else if (intentos >= intentosMaximos) {
                System.out.println("No acertaste. Alcanzaste el máximo de " + intentosMaximos + " intentos. El número secreto era: " + numeroSecreto);
                break;

            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor que " + numeroUsuario + ".");

            } else {
                System.out.println("El número secreto es menor que " + numeroUsuario + ".");

            }

        } while (numeroUsuario != numeroSecreto);
    }

    public static void main(String[] args) {
        adivinanza_t iniciar = new adivinanza_t();
        iniciar.inicio();
        iniciar.validacion();
    }
}
