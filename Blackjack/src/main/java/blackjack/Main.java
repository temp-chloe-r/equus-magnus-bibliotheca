package blackjack;

import java.util.Scanner;

/* A Class to calculate which card value is closest to 21 without going over. 
 * play will return 0 if both are higher. 
 * */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int x = sc.nextInt();
        System.out.println("Please enter second number:");
        int y = sc.nextInt();
        System.out.println("Result: " + play(x, y));
    }

    public static int play(int x, int y) {
        if (x > 21 && y > 21) return 0;         // both numbers are too high
        if (x > y && x <= 21) return x;         // x is larger, and not too high
        else if (x < y && y > 21) return x;     // x is smaller, but y would be too large
        else return y; 
    }
}