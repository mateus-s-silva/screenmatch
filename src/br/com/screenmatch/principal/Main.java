package br.com.screenmatch.principal;

import br.com.screenmatch.calculos.Classificavel;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.calculos.TimeCalculator;
import br.com.screenmatch.modelos.Episode;
import br.com.screenmatch.modelos.Movie;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Movie coolMovie = new Movie("Cidade de Deus", 1999);
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Serie friends = new Serie("Friends", 2003);
        TimeCalculator calculadora = new TimeCalculator();

        // coolMovie.setName("Cidade de Deus");
        // coolMovie.setReleaseYear(1999);
        coolMovie.setTittleLenght(200);

        coolMovie.evaluate(10);
        coolMovie.evaluate(10);
        coolMovie.evaluate(10);
        coolMovie.calculaMedia();

        coolMovie.datasheet();
        filtro.filtra(coolMovie);


        //friends.setName("Friends");
        //friends.setReleaseYear(2000);
        friends.setSeasons(10);
        friends.setMinutesPerEpisode(22);
        friends.setEpisodes(10);

        friends.datasheet();

        calculadora.include(friends);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        Episode episodio = new Episode(1);

        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        var newMovie = new Movie("Dogville", 2003);
        newMovie.setTittleLenght(200);
        //newMovie.setName("Dogville");
        //newMovie.setReleaseYear(2003);
        newMovie.evaluate(9.2F);

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(newMovie);
        listaDeFilmes.add(coolMovie);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getName());
        System.out.println(listaDeFilmes);

    }
}
