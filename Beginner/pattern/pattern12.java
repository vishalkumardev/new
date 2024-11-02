package pattern;

public class pattern12 {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i - j + 1);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);

    }
}
