package pattern;

public class pattern14 {
    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
            char count = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);

    }
}