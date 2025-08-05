public class Main {
    public static void main(String[] args){

        //Declara el tipo de dato que se usara
        int lanzamiento, estrellas, clasificacion, contador;
        boolean incluido;
        double puntuacion, media;
        String sinopsis, star;

        //Se declara el dato
        contador = 1;
        lanzamiento = 2000;
        incluido = true;
        puntuacion = 5.2;
        estrellas = (int) puntuacion;
        star = "⭐";
        media = (8.3 + 6.3 + 1.5) / 3;
        clasificacion = (int) media / 2;

        sinopsis = """
                Niño heurfano que tiene magia,
                basado en los libros de J.K Rowlign, la primera pelicula
                salio en el año
                """ + lanzamiento;

        //Imprimir datos declarado
        System.out.println("Catalogo de peliculas.");
        System.out.println("-".repeat(10));
        System.out.println("Pelicula: Harry Potter.");
        System.out.println("Lanzamiento: " + lanzamiento);
        System.out.println("Incluido en catalogo: " + incluido);
        System.out.println("Puntuacion propia: " + puntuacion);
        System.out.println("Clasificacion de media: " + clasificacion);
        for (int i = 1; i <= estrellas; i++ ){
            if (estrellas == contador){
                System.out.println("Puntuacion estrellas: " + estrellas + " " + star.repeat(contador));

            }else {
                contador += 1;
            }
        }
        System.out.println("Promedio comunidad: " + media);
        System.out.println("Sipnosis: " + sinopsis);
    }
}