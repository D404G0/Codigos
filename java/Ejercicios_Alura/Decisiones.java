public class Decisiones {
    public static void main(String[] args) {
        int lanzamiento, estrellas, clasificacion, contador;
        boolean incluido;
        double puntuacion, media;
        String sinopsis, star, plan;

        //Se declara el dato
        contador = 1;
        lanzamiento = 2000;
        incluido = false;
        puntuacion = 5.2;
        estrellas = (int) puntuacion;
        media = (8.3 + 6.3 + 1.5) / 3;
        clasificacion = (int) media / 2;
        star = "⭐";
        plan = "plus";

        // Condicional de valor
        if (lanzamiento > 2000){
            System.out.println("Pelicula del milenio");

        }else {
            System.out.println("Peliculas retro");
        }

        if (incluido && plan.equals("Plus")){
            System.out.println("Esta maravillosa pelicula esta en su plan.");

        }else {
            System.out.println("Esta maravillosa pelicula no esta en su plan");
        }
    }
}
