package FizzBuzz;

//Class made to enable the use of simple assert statements with returned values//
public class FizzBuzzForTest {
    public static String generateFizzBuzz(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("FizzBuzz");
            } else if (i % 3 == 0) {
                result.append("Fizz");
            } else if (i % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(i);
            }

            if (i < n) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}
