//super clase
class chambeador {
    String nombre, cargo;
    int edad, sueldo;

    //constructor
    public chambeador(String nombre, String cargo, int edad, int sueldo){
        this.nombre =  nombre;
        this.cargo = cargo;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    //Metodo para mostrar la informacion
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo base $5000000: " + sueldo);
    }
}

//subclase que hereda
class gerente extends chambeador {
    String oficina;

    public gerente(String nombre, String cargo, String oficina, int edad, int sueldo){
        super(nombre, cargo, edad, sueldo);
        this.oficina = oficina;
    }

    @Override
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo con bono de $1500000: " + sueldo);
        System.out.println("Oficina: " + oficina);
    }
}

//subclase que hereda
class programador extends chambeador {
    String computador;

    public programador(String nombre, String cargo, String computador, int edad, int sueldo){
        super(nombre, cargo, edad, sueldo);
        this.computador = computador;
    }

    @Override
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo con bono de $1500000: " + sueldo);
        System.out.println("COmputador: " + computador);
    }
}

class empleados{
    public static void main(String[] args){

        gerente g = new gerente("Juliana", "Gerente", "K1110", 25, 7000000);
        g.mostrar();

        System.out.println("");

        programador p = new programador("Diego", "Desarrollador", "Lenovo Q110", 25, 6500000);
        p.mostrar();
    }
}