package org.javaCore.associations.test;

import org.javaCore.associations.domain.Player;
import org.javaCore.associations.domain.Team;

public class TeamTest01 {
    public static void main(String[] args) {
        Player player01 = new Player("Dudu");
        Player player02 = new Player("Rony");
        Player player03 = new Player("Raphael Veiga");

        Player[] players = {player01, player02, player03};
        Team team01 = new Team("Palmeiras", players);
//        team01.setPlayers(players);

        team01.printTeam();
    }
}
