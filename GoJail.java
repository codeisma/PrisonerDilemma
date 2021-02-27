package com.codeisma;

import java.util.Scanner;

public class GoJail {

    Scanner silentBetray = new Scanner(System.in);

    public void friend(){
        String p1;
        String p2;

        int yearP1 =0;
        int yearP2 =0;
        int turn =0;

            System.out.println("P1: B for Betray S for Silent!!!!");
            p1 = silentBetray.next();
            System.out.println("P2: B for Betray S for Silent!!!!");
            p2 = silentBetray.next();

            if (p1.equals("S") && p2.equals("S")) {
                yearP1 += 1;
                yearP2 += 1;
            } else if (p2.equals("S") && p1.equals("B")) {
                yearP2 += 2;
            } else if (p1.equals("S") && p2.equals("B")) {
                yearP1 += 2;
            } else {
                yearP1 += 3;
                yearP2 += 3;
            }

            System.out.println("Prisoner p1: will be in jail " + yearP1 + " year");
            System.out.println("Prisoner p2: will be in jail " + yearP2 + " year");

    }
}