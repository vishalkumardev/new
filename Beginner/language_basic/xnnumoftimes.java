package language_basic;

public class xnnumoftimes {

    public static void printNumOfTimes(int X, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(X);

            if (i < N - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        printNumOfTimes(7, 5);
    }
}
