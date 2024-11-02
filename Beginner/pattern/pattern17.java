package pattern;

public class pattern17 {
    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
            char count = 65;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (i - 1) + 1; j++) {
                System.out.print(count);
                if (j < i - 1) {
                    count++;
                } else {
                    count--;
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);

    }
}