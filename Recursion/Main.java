/**
 * Main
 */
public class Main {

    public static double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }

        if (n % 2 == 0) {
            // Recursive call: x * x, n / 2
            return myPow(x * x, n / 2);
        }

        return x * myPow(x, n - 1);
    }

    public static double generateAns(int x, int n) {
        if (n < 0) {
            // Calculate the power of -n and take reciprocal
            return 1.0 / myPow(x, -n);
        }

        // If 'n' is non-negative
        return myPow(x, n);
    }

    public static void main(String[] args) {

        System.out.println(generateAns(2, -2));

    }
}