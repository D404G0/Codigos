// Gregar si el valor esta en los ejes

import java.util.*;

class Main {
    
    //Atributo clase
    int x, y;
    Scanner leer;
    
    //Metodo inicial
    public void datos(){
        leer = new Scanner(System.in);
        
        System.out.println("Ingrese su dato en x ");
        x = leer.nextInt();
        
        System.out.println("Ingrese su dato en y ");
        y = leer.nextInt();
    }
    
    public void secuencia(){
        if (x > 0  && y > 0){
        System.out.print(x + " y " + y + " esta en el primer cuadrante");
        
    }else if(x < 0 && y > 0 ){
        System.out.print(x + " y " + y + " esta en el segundo cuadrante");
        
    }else if(x < 0 && y < 0){
        System.out.print(x + " y " + y + " esta en el tercer cuadrante");
        
    }else if(x > 0 && y < 0){
        System.out.print(x + " y " + y + " esta en el cuarto cuadrante");
        
    }else if(x == 0 && y == 0) {
        System.out.print(x + " y " + y + " esta en el la raiz");
    }
}

    public static void main(String[] args) {
        //Definir objeto
        Main uno; 
        
        //Crear objeto de la clase
        uno = new Main();
        
        //Llamar metodo
        uno.datos();
        
        //Llamar metodo
        uno.secuencia();
        
    }
}