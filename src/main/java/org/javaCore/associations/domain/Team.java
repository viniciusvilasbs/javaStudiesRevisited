package org.javaCore.associations.domain;

public class Team {
    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players) {
        this(name);
        this.players = players;
    }

    public void printTeam() {
        if (name == null) {
            System.out.println("Nome do time inválido!");
            return;
        } else if (players == null) {
            System.out.println("Esse time não possui jogadores!");
            return;
        } else {
            System.out.println("Nome do time: " + this.name);
            for (Player player : players) {
                System.out.println("Nome dos jogadores: " + player.getName());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
