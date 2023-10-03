package br.com.screenmatch.modelos;

import br.com.screenmatch.exception.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int releaseYear;
    private boolean includedInAssignature;

    private float evaluationAmount;
    private float average;
    private int tittleLenght;

    private int evaluationCounter;

    /* -------------------------------------------------------------------- */
    public Titulo(String nome, int releaseYear) {
        this.nome = nome;
        this.releaseYear = releaseYear;
    }

    public float getAverage() {
        return average;
    }

    public int getTittleLenght() {
        return tittleLenght;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInAssignature(boolean includedInAssignature) {
        this.includedInAssignature = includedInAssignature;
    }

    public void setTittleLenght(int tittleLenght) {
        this.tittleLenght = tittleLenght;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void datasheet(){
        System.out.println("Nome do título: " + nome);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Incluso no seu plano: " + includedInAssignature);
        System.out.println("Duração do título: " + this.getTittleLenght() + " min");
        System.out.println("Avaliação do título: " + average);
    }

    public void calculaMedia(){
        this.average = evaluationAmount/evaluationCounter;
    }

    public void evaluate(float evaluation){
        evaluationAmount += evaluation;
        evaluationCounter++;
    }
    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }
}
