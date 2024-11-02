package pattern;

public class pattern16 {
    public static void printPattern(int n) {

        char count = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
            }
            count++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);

    }
}