package language_basic;

public class last_char {

    public static char printLastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    public static void main(String[] args) {
        String s = "example";

        System.out.println(printLastChar(s));

    }
}
