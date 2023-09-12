package br.com.screenmatch.modelos;

public class Titulo {
    private String name;
    private int releaseYear;
    private boolean includedInAssignature;
    private float evaluationAmount;
    private float average;
    private int tittleLenght;
    private int evaluationCounter;

    /* -------------------------------------------------------------------- */
    public float getAverage() {
        return average;
    }
    public int getTittleLenght() {
        return tittleLenght;
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

    public void setName(String name) {
        this.name = name;
    }

    public void datasheet(){
        System.out.println("Nome do título: " + name);
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
}