import java.util.*;

class calculadora {
    int valor_inicial;

    public calculadora(int valor_inicial) {
        this.valor_inicial = valor_inicial;
    }

    public int sumar(int num_uno, int num_dos) {
        return num_uno + num_dos;
    }

    public int sumar(int num_uno, int num_dos, int num_tres) {
        return num_uno + num_dos + num_tres;
    }

    public int sumar(int num_uno, int num_dos, int num_tres, int num_cuatro) {
        return num_uno + num_dos + num_tres + num_cuatro;
    }

    public void mostrar() {
        System.out.println("Valor inicial: " + valor_inicial);
    }
}

class sobrecarga {
    public static void main(String[] args) {
        System.out.println("5. Sobrecarga de Métodos y Constructores");

        calculadora info_uno = new calculadora(10);
        calculadora info_dos = new calculadora(20);
        calculadora info_tres = new calculadora(30);

        info_uno.mostrar();
        System.out.println("Suma de 2 números: " + info_uno.sumar(5, 10));
        System.out.println(" ");

        info_dos.mostrar();
        System.out.println("Suma de 3 números: " + info_dos.sumar(5, 10, 15));
        System.out.println(" ");

        info_tres.mostrar();
        System.out.println("Suma de 4 números: " + info_tres.sumar(5, 10, 15, 20));
        System.out.println(" ");
    }
}
