package com.tak.rock;

import java.util.Scanner;

class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HumanPlayer hp = new HumanPlayer();
        ComputerPlayer cp = new ComputerPlayer();
        String[] hands = {"가위", "바위", "보"};

        int retry;      //다시 한번 더

        do {
            int computer = cp.nextHand();

            int human = hp.nextHand();

            System.out.println("나는" + hands[computer] + "이고, 당신은 " + hands[human] + "입니다!");

            int judge = (human - computer + 3) % 3;
            switch (judge) {
                case 0 :
                    System.out.println("비겼습니다.");
                    break;
                case 1 :
                    System.out.println("당신이 졌습니다.");
                    break;
                case 2 :
                    System.out.println("당신이 이겼습니다.");
                    break;
            }

            do {
                System.out.print("다시 한번 더 ? 0..아니오 / 1..네 : ");
                retry = sc.nextInt();
            } while (retry != 0 && retry != 1);
        } while (retry == 1);

    }


}
