package br.com.screenmatch.principal;

import br.com.screenmatch.exception.ErroDeConversaoDeAnoException;
import br.com.screenmatch.modelos.Titulo;
import br.com.screenmatch.modelos.TituloDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        HttpClient client = HttpClient.newHttpClient();
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        gsonBuilder.registerTypeAdapter(Titulo.class, new TituloDeserializer());

        Gson gson = gsonBuilder.create();

        List<Titulo> listaTitulos = new ArrayList<Titulo>();

        String busca = "";

        while(!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca: ");
            busca = scanner.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=11af8de7";

            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                System.out.println(response.body());

                String json = response.body();

                Titulo meuTitulo = gson.fromJson(json, Titulo.class);

                System.out.println(meuTitulo.getNome() + ", " + meuTitulo.getReleaseYear());

                listaTitulos.add(meuTitulo);

            } catch (ErroDeConversaoDeAnoException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(listaTitulos);

        FileWriter fileWriter = new FileWriter("teste.json");
        fileWriter.write(gson.toJson(listaTitulos));

        fileWriter.close();
    }
}
