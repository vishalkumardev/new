public class Palindrome {

    public static boolean Palindrome(String s) {
        int start = 0, end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aabbaaa";

        System.out.println(Palindrome(s));

    }
}
