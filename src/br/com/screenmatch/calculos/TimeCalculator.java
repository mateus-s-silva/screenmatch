package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Titulo;

public class TimeCalculator {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void include(Movie filme) {
//        tempoTotal += filme.getTittleLenght();
//    }
//
//    public void include(Serie serie){
//        tempoTotal +=   serie.getTittleLenght();
//    }

    public void include(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getTittleLenght();
    }
}
