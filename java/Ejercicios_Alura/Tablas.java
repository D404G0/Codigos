import java.util.*;
public class Tablas {
    Scanner leer;
    int num, tabla;

    public void iniciar(){
        leer = new Scanner (System.in);
        do{
            System.out.print("Ingrese el número de la tabla: ");
            num = leer.nextInt();
            if(num>0){
                tabla(num);
            }
        } while (num!=0);

    }

    public void tabla(int num){
        for (int i = 1; i <= 10; i++){
            tabla = num * i;
            System.out.println(num + " x " + i + " = " + tabla);
        }
    }

    public static void main(String[] args) {
        Tablas uno;
        uno = new Tablas();
        uno.iniciar();
    }
}