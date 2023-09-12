package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificavel;

public class Movie extends Titulo implements Classificavel {
    private String director;

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int) getAverage() / 2;
    }
}
