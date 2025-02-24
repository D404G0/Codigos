import java.util.Scanner;

public class AñoNuevoSaludo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre al usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Mensaje de saludo de Año Nuevo
        System.out.println("\n¡Feliz Año Nuevo, " + nombre + "! 🎉🎊");
        System.out.println("Que este nuevo año te traiga mucha felicidad, salud y éxito.");

        // Cerrar el scanner
        scanner.close();
    }
}

