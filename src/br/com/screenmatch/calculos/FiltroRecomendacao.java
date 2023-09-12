package br.com.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos da galera.");
        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("Bem avaliado.");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }   
}
