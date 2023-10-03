package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Movie;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.*;

public class mainWithList {
    public static void main(String[] args) {
        Movie meuFilme = new Movie("Star Wars", 1999);
        meuFilme.evaluate(9);
        Movie teuFilme = new Movie("Star Trek", 1998);
        teuFilme.evaluate(8);
        Serie lost = new Serie("Lost", 2000);
        lost.evaluate(9);

        meuFilme.calculaMedia();
        teuFilme.calculaMedia();
        lost.calculaMedia();

        ArrayList<Titulo> lista = new ArrayList<Titulo>();

        lista.add(meuFilme);
        lista.add(teuFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item.getClass() == Movie.class && ((Movie) item).getClassificacao() > 2){
                /*
                 Aqui eu poderia ter utilizado "item instanceof Filme" no 'if', mas resolvi testar isso
                 e funcionou hehehe
                */
                System.out.println("Classificação do filme: " + ((Movie) item).getClassificacao());

                //System.out.println(item.getClass());
                //System.out.println(Movie.class);
            }
            else {
                System.out.println("Classificação da série: " + item.getAverage());
            }
        }

        List<String> buscaPorArtista = new ArrayList<String>();
        buscaPorArtista.add("Matue");
        buscaPorArtista.add("Evoney");
        buscaPorArtista.add("Igor Bz");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println(buscaPorArtista);

        Collections.sort(lista);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getReleaseYear));

        System.out.println(lista);
    }
}
