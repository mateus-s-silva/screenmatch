package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificavel;

public class Episode implements Classificavel {
    private int numberOfEpisode;
    private String nameOfEpisose;
    private String serie;
    private int totalVisualizacoes;


    public Episode(int numberOfEpisode) {
        this.numberOfEpisode = numberOfEpisode;
    }

    public int getTotalVisualizacoes() {
        return this.totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public String getNameOfEpisose() {
        return nameOfEpisose;
    }

    public void setNameOfEpisose(String name) {
        this.nameOfEpisose = name;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizacoes > 100){
            return 4;
        }
        else{
            return 2;
        }
    }
}
