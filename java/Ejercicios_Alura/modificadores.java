import java.util.*;

class cuenta_banco {
    private double saldo;

    public cuenta_banco() {
        this.saldo = 0.0;
    }

    public cuenta_banco(double saldo_inicial) {
        this.saldo = saldo_inicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);

        } else {
            System.out.println("Cantidad inválida.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);

        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    public void mostrar_saldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}

class modificadores {
    public static void main(String[] args) {
        System.out.println("4. Modificadores de Acceso");

        // Creación de cuentas con diferentes constructores
        cuenta_banco cuenta_uno = new cuenta_banco();
        cuenta_banco cuenta_dos = new cuenta_banco(1000);

        // Operaciones en la cuenta_uno
        System.out.println("\nCuenta Uno:");
        cuenta_uno.mostrar_saldo();
        cuenta_uno.depositar(500);
        cuenta_uno.retirar(200);
        cuenta_uno.mostrar_saldo();

        // Operaciones en la cuenta_dos
        System.out.println("\nCuenta Dos:");
        cuenta_dos.mostrar_saldo();
        cuenta_dos.depositar(500);
        cuenta_dos.retirar(300);
        cuenta_dos.retirar(2000);
        cuenta_dos.mostrar_saldo();
    }
}
