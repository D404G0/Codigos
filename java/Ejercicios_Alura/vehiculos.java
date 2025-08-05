import java.util.*;

//Super clase
class auto_motor {
    String marca, modelo, color;

    //constructor
    public auto_motor(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //Metodo de mostrar
    public void mostrar(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

//subclase 1
class auto extends auto_motor {
    String num_puertas, espacio_interno;

    //constructor
    public auto(String marca, String modelo, String color, String num_puertas, String espacio_interno){
        super(marca, modelo, color);
        this.num_puertas = num_puertas;
        this.espacio_interno = espacio_interno;
    }

    public void mostrar_auto(){
        System.out.println("Numero de puertas: " + num_puertas);
        System.out.println("Espacio interno: " + espacio_interno);
    }
}

//subclase 2
class moto extends auto_motor {
    String tipo;
    int cilindraje;

    //constructor
    public moto(String marca, String modelo, String color, int cilindraje, String tipo){
        super(marca, modelo, color);
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    public void mostrar_moto(){

        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Tipo: " + tipo);
    }
}

class vehiculos{
    public static void main(String[] args){
        System.out.println("1. Sistema de Vehiculos.");

        auto especificacion_a = new auto("Tesla", "Model X", "Gris", "4 Puertas", "4 Personas");

        moto especificacion_m = new moto("Honda", "CBX", "Morada", 250, "deportiva");

        especificacion_a.mostrar();
        especificacion_a.mostrar_auto();

        System.out.println(" ");

        especificacion_m.mostrar();
        especificacion_m.mostrar_moto();
    }
}