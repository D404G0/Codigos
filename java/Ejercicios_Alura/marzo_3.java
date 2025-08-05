import java.util.*;

public class marzo_3 {
    Scanner leer;
    float[] turno_m; //Define un vector
    float[] turno_t; //Define un vector

    int suman, sutar;


    public void inicio(){
        leer = new Scanner(System.in);

        System.out.println("Ingreso la cantidad de sueldos de la mañana: ");
        suman = leer.nextInt();
        turno_m = new float[suman];

        for (int f = 0; f < suman; f++){
            System.out.println("Ingrese sueldo: ");

            turno_m[f] = leer.nextFloat();
        }

        System.out.println("Ingreso de sueldos de turno de la tarde.");
        sutar = leer.nextInt();
        turno_t = new float[sutar];

        for (int f = 0; f < sutar; f++){
            System.out.println("Ingrese sueldo: ");

            turno_t[f] = leer.nextFloat();
        }

    }

    public void calcular(){
        float man = 0, tar = 0;

        for (int f = 0; f < 4; f++){
            man = man + turno_m[f];

            tar = tar + turno_t[f];
        }
        System.out.println("Total gastos del turno de la mañana: " + man);
        System.out.println("Total gastos del turno de la tarde: " + tar);
    }

    public static void main(String[] args){
        marzo_3 llamar = new marzo_3();

        llamar.inicio();
        llamar.calcular();

    }
}
