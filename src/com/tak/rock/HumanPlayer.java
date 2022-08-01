package com.tak.rock;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private static Scanner sc;
    static {
        sc = new Scanner(System.in);
    }

    public int nextHand() {
        do {
            System.out.print("가위 바위 보!!! 0..가위 / 1..바위 / 2..보 : ");
            hand = sc.nextInt();
        } while (hand < 0 || hand > 2);
        return hand;

    }



}
