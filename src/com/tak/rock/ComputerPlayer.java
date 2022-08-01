package com.tak.rock;

import java.util.Random;

public class ComputerPlayer extends Player{
    private static Random random;
    static {
        random = new Random();
    }

    public int nextHand() {
        return random.nextInt(3);

    }

}
