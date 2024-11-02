package pattern;

public class pattern15 {
    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
            char count = 65;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);

    }
}