public class LargestOdd {

    public static String LargestOddNum(String s) {

        int start = 0;
        int end = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) % 2 == 1) {
                end = i;
                break;
            }
        }

        if (end == -1)
            return "";

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != '0') {
                start = i;
                break;
            }
        }

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {

        String s = "0032579";

        System.out.println(LargestOddNum(s));

    }
}
