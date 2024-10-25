package blackjack;

/* A Class to calculate which card value is closest to 21 without going over. 
 * play will return 0 if both are higher. 
 * */

public class Main {
    public static void main(String[] args) {
        System.out.println(play(22, 23));   // example run of play func.
    }

    public static int play(int x, int y) {
        if (x > 21 && y > 21) return 0;         // both numbers are too high
        if (x > y && x <= 21) return x;         // x is larger, and not too high
        else if (x < y && y > 21) return x;     // x is smaller, but y would be too large
        else return y; 
    }
}