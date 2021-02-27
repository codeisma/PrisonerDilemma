package com.codeisma;

import java.util.Scanner;

    public class Main{
        public static void main(String[]args){
            GoJail jail = new GoJail();
            Scanner scanner = new Scanner (System.in);
            System.out.println("This is Prisoner Dilemma");
            System.out.println("Y / N");
            String scan = scanner.next();

            if (scan.equals("Y")) {
                jail.friend();
            }
        }
    }