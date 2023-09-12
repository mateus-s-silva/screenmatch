package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificavel;

public class Episode extends Serie implements Classificavel {
    private int number;
    private String nameOfEpisose;
    private String serie;
    private int totalVisualizacoes;

    public Episode(int number) {
        this.number = number;
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
