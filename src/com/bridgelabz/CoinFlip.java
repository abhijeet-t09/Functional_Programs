package com.bridgelabz;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int heads = 0;
        int tails = 0;
        float percentH, percentT;

        System.out.print("Enter no . of time the coin is to be tossed: ");
        int flip = sc.nextInt();

        for(int i = 0; i < flip; i++){
            double random = Math.random();

            if (random < 0.5)
                heads++;

            else
                tails++;
        }

        percentH = (heads / (float) flip) * 100;
        percentT = (tails / (float) flip) * 100;

        System.out.println("Percentage of Heads Appearing :: " + percentH + "%");
        System.out.println("Percentage of Tails Appearing :: " + percentT + "%");

    }
}
