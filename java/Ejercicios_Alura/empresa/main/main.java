package empresa.main;

import empresa.personal.gerente;

public class main {
    public static void main(String[] args) {
        System.out.println("2. Uso de paquetes");

        gerente gerente1 = new gerente("Carlos", "Gerente General", 12000000);
        gerente gerente2 = new gerente("Ana", "Gerente de Marketing", 8000000);

        gerente1.mostrar();
        System.out.println(" ");

        gerente2.mostrar();
        System.out.println(" ");
    }
}
