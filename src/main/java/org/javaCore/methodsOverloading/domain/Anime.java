package org.javaCore.methodsOverloading.domain;

public class Anime {
    private String name;
    private String type;
    private String gender;
    private int episode;

    public Anime() {
    }

    public Anime(String name, String type, int episode) {
        this.name = name;
        this.type = type;
        this.episode = episode;
    }
    public Anime(String name, String type, String gender, int episode) {
        this.name = name;
        this.type = type;
        this.episode = episode;
        this.gender = gender;
    }

    public void printAnime() {
        System.out.println("Nome: " + this.name);
        System.out.println("Gênero: " + this.gender);
        System.out.println("Tipo: " + this.type);
        System.out.println("Episódio: " + this.episode);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getEpisode() {
        return this.episode;
    }
}
