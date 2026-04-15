package com.plularsight;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class highscoreWins {
    public static void main(String[] args) {


        // Creating a Scanner
        Scanner theScanner= new Scanner(System.in);

        System.out.println("Please enter a game score");
        //
        String theScore = theScanner.nextLine();

        String[] parts = theScore.split("\\|");
        System.out.println(parts[0]);
        System.out.println(parts[1]);

        String[] myTeam = parts[0].split(":");
        String team1 = myTeam[0];
        String team2 = myTeam[1];
        System.out.println(myTeam[0]);
        System.out.println(myTeam[1]);

        String[] myTeamScore= parts[1].split(":");
        int teamScore1 = Integer.parseInt(myTeamScore[0]);
        int teamScore2 = Integer.parseInt(myTeamScore[1]);
        System.out.println(myTeamScore [0]);
        System.out.println(myTeamScore[1]);


        if(teamScore1 > teamScore2 ) {
            System.out.println("Winner is " + team1);
        } else{
            System.out.println("Winner is " + team2);
        }


































    }
}
