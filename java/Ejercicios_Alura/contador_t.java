import java.util.*;

public class contador_t {
    int num1;
    Scanner input;

    public void inicio() {
        input = new Scanner(System.in);

        System.out.println("Ingrese un número para encontrar los primos que estan en ese rango:");
        num1 = input.nextInt();
    }

    public void validacion() {
        double raiz;
        System.out.println("Números primos encontrados:");

        for (int i = 2; i <= num1; i++) {
            raiz = Math.sqrt(i);

            boolean Primo = true;

            for (int j = 2; j <= raiz; j++) {

                if (i % j == 0) {
                    Primo = false;

                    break;

                }
            }

            if (Primo) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        contador_t iniciar = new contador_t();

        iniciar.inicio();
        iniciar.validacion();
    }
}
