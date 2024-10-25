package uniquesum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int x = sc.nextInt();
        System.out.println("Please enter second number:");
        int y = sc.nextInt();
        System.out.println("Please enter third number:");
        int z = sc.nextInt();
        System.out.println("Result: " + uniqueSum(x, y, z));
    }

    public static int uniqueSum(int x, int y, int z) {
        int res = 0;
        if (x != y && x != z) res += x;
        if (x != y && y != z) res += y;
        if (z != y && x != z) res += z;
        return res;
    }
}