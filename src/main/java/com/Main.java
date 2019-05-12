package com;

import com.texasholdem.Dealer;
import com.texasholdem.Player;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dealer d = new Dealer();

        Player me = new Player();
        Player you = new Player();

        d.join(me);
        d.join(you);

        d.start();
        d.showHand();

        List<Player> players = d.getRankingPlayers();

        for (Player player : players) {
            System.out.println(player.toString());
        }
    }

}
