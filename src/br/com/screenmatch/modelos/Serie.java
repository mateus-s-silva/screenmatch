package br.com.screenmatch.modelos;

public class Serie extends Titulo{
    private int seasons;
    private int episodes;
    private int minutesPerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }
    @Override
    public int getTittleLenght(){
        return minutesPerEpisode * episodes * seasons;
    }
}
