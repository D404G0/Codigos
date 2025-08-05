import java.util.*;

public class banco {
    public static void main(String[] args){

        //Declaracion de variables
        String nombre;
        int menu;
        double dinero, retiro, consignacion;

        //Metodo de input
        Scanner teclado =  new Scanner(System.in);

        //Declaracion de valores y mensajes
        System.out.println("----".repeat(10));
        System.out.println("Bancolombia");
        System.out.println("Ingrese su nombre de cuenta: ");
        System.out.println("----".repeat(10));
        nombre = teclado.nextLine();
        dinero = 5000.00;

        //Bucle de menu
        System.out.println("Hola " + nombre + ", Bienvenid@ a tu cuenta. ");
        System.out.println("Toda persona nueva que abra su cuenta bancaria es acrededora de 5000.00$ ");
        while (true){

            System.out.println("----".repeat(10));
            System.out.println("""
                    Menu:
                    1. Ver saldo.
                    2. Retirar.
                    3. Consignar
                    4. Salir
                    """);
            System.out.println("----".repeat(10));

            System.out.println("Ingrese la opcion de su preferencia: ");
            menu = teclado.nextInt();

            //Condicional de menu
            if (menu == 1){
                System.out.println("----".repeat(10));
                System.out.println("El saldo de su cuenta es: " + dinero + "$");

            }else if (menu == 2){
                System.out.println("----".repeat(10));
                System.out.println("Ingrese el saldo que desea retirar: ");
                retiro = teclado.nextDouble();

                if (retiro > dinero){
                    System.out.println("----".repeat(10));
                    System.out.println("Transaccion rechazada, intentelonuevamente:");

                }else {
                    System.out.println("----".repeat(10));
                    System.out.println("Retiro: " + retiro);
                    System.out.println("Saldo actual:" + (dinero -= retiro));

                }

            }else if (menu == 3){
                System.out.println("----".repeat(10));
                System.out.println("Ingrese el saldo que desea consignar: ");
                consignacion = teclado.nextDouble();

                System.out.println("Saldo total: " + (dinero += consignacion));

            }else if (menu == 4){
                System.out.println("----".repeat(10));
                System.out.println("Saliendo ...");
                break;

            }else {
                System.out.println("----".repeat(10));
                System.out.println("Valor incorrecto, intentelo nuevamente.");
            }
        }

    }
}
