package org.javaCore.associations.domain;

public class Player {
    private String name;
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Team team) {
        this(name);
        this.team = team;
    }

    public void printPlayer() {
        if (team == null) {
            System.out.println("Não há time cadastrado para o jogador!");
            return;
        }
        System.out.println("Nome do jogador: " + this.name);
        System.out.println("Nome do time: " + this.team.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
