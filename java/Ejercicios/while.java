import java.util.*;

class Main {
    public static void main(String[] args) {
        int x = 1;
        Scanner leer = new Scanner (System.in);
        
        while(x != 0){
            System.out.println("Ingrese un número: ");
            x = leer.nextInt();
            
            if (x != 0){
                System.out.println("Ingreso " + x);
            }
            
        }
    }
}