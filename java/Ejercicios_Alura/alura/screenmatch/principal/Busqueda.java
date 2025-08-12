package com.alura.screenmatch.principal;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class Busqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la pelicula que desea consultar: ");
        var busqueda = leer.nextLine();

        String direccion = "http://www.omdbapi.com/?t="+busqueda+"&apikey=3aca20e8";

        HttpClient client = HttpClient.newHttpClient();

        //Builder es un patron de diseño
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
