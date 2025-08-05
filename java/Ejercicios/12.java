import java.util.*;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void iniciar(String[] args) {
        int mayor, menor, valor1, valor2, valor3;
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba el primer valor");
        valor1 = leer.nextInt();
        
        System.out.println("Escriba el primer valor");
        valor2 = leer.nextInt();
        
        System.out.println("Escriba el primer valor");
        valor3 = leer.nextInt();
        
        mayor = calcular_mayor(valor1, valor2, valor3);
        System.out.println("El número mayor es " + calcular_mayor);
        
        menor = calcular_mayor(valor1, valor2, valor3);
        System.out.println("El número mayor es " + calcular_menor);
    }
    
    public void int calcular_mayor(valor1, valor2, valor3){
        int mayor, menor, valor1, valor2, valor3;
        if (valor1 > valor2 && valor1 > valor3){
            mayor = valor1;
        }else if (valor2 > valor1 && valor2 > valor3) {
            mayor = valor2;
        }else if (valor3 > valor1 && valor3 > valor2 ){
            mayor = valor3;
        }
        return mayor;
    }
    
    public void int calcular_menor(){
        int mayor, menor, valor1, valor2, valor3;
        if (valor1 < valor2 && valor1 < valor3){
            mayor = valor1;
        }else if (valor2 < valor1 && valor2 < valor3) {
            mayor = valor2;
        }else if (valor3 < valor1 && valor3 < valor2 ){
            mayor = valor3;
        }
        
        return menor;
    }
    
    public static void Main(String[] args){
        Main uno = new Main();
        
        uno.iniciar();
    }
}

