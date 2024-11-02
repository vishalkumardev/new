import java.util.Arrays;

public class LargestCommon {

    public static String longestCommonPrefix(String[] s) {

        Arrays.sort(s);

        StringBuilder str = new StringBuilder("");

        String start = s[0], end = s[s.length - 1];

        for (int i = 0; i < Math.min(start.length(), end.length()); i++) {

            if (start.charAt(i) != end.charAt(i)) {
                break;
            }

            str.append(start.charAt(i));
        }

        return str.toString();
    }

    public static void main(String[] args) {

        String[] input = { "lady", "lazy" };
        String result = longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + result);
    }
}
