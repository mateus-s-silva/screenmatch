import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.calculos.TimeCalculator;
import br.com.screenmatch.modelos.Episode;
import br.com.screenmatch.modelos.Movie;
import br.com.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Movie coolMovie = new Movie();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Serie friends = new Serie();
        TimeCalculator calculadora = new TimeCalculator();

        coolMovie.setName("Cidade de Deus");
        coolMovie.setReleaseYear(1999);
        coolMovie.setTittleLenght(200);

        coolMovie.evaluate(10);
        coolMovie.evaluate(10);
        coolMovie.evaluate(10);
        coolMovie.calculaMedia();

        coolMovie.datasheet();
        filtro.filtra(coolMovie);


        friends.setName("Friends");
        friends.setReleaseYear(2000);
        friends.setSeasons(10);
        friends.setMinutesPerEpisode(22);
        friends.setEpisodes(10);

        friends.datasheet();

        calculadora.include(friends);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        Episode episodio = new Episode(1);

        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

    }
}
