package org.javaCore.associations.test;

import org.javaCore.associations.domain.Player;
import org.javaCore.associations.domain.Team;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player01 = new Player("Dudu");
        Team team01 = new Team("Palmeiras");

        player01.setTeam(team01);
        player01.printPlayer();
    }
}
