package pattern;

public class pattern18 {
    public static void printPattern(int n) {

        char ch = 65;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch + 5);

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);

    }
}