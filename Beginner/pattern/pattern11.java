package pattern;

public class pattern11 {
    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {

            int flag;
            if (i % 2 == 0)
                flag = 0;
            else
                flag = 1;

            for (int j = 0; j < i; j++) {
                System.out.print(flag);
                flag = 1 - flag;
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);

    }
}
