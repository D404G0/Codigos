public class Ejercicio {
    public static void main(String[] args){

        //Declaracion de valores
        int temperatura, casting;
        double celcius;

        temperatura = 32;
        celcius = (temperatura * 1.8) + 32;

       System.out.println(celcius);

       casting = (int) celcius;

       System.out.println(casting);
    }
}
