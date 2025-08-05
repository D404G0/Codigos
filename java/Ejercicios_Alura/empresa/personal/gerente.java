package empresa.personal;

public class gerente {
    String nombre, cargo;
    int salario;

    public gerente(String nombre, String cargo, int salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }
}
