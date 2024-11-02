public class Main {

    public static boolean isHappy(int n) {

        if (n == 1) {
            return true;
        }

        while (n > 9) {

            int sum = 0;

            while (n != 0) {
                int lastDigit = n % 10;
                sum += lastDigit * lastDigit;
                n = n / 10;
            }

            if (sum == 1)
                return true;

            n = sum;

        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(isHappy(1));
    }
}
