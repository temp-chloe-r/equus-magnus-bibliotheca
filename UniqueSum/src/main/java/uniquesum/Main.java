package uniquesum;

public class Main {
    public static void main(String[] args) {
        System.out.println(uniqueSum(1, 1, 2));
    }

    public static int uniqueSum(int x, int y, int z) {
        int res = 0;
        if (x != y && x != z) res += x;
        if (x != y && y != z) res += y;
        if (z != y && x != z) res += z;
        return res;
    }
}