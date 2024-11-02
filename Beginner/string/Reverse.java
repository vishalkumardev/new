import java.util.Vector;

/**
 * Reverse
 */
public class Reverse {

    public static Vector<Character> reverseString(Vector<Character> s) {

        int start = 0, end = s.size() - 1;

        while (start <= end) {
            char temp = s.get(start);
            s.set(start, s.get(end));
            s.set(end, temp);
            start++;
            end--;
        }

        return s;
    }

    public static void main(String[] args) {

        Vector<Character> str = new Vector<>();
        str.add('h');
        str.add('e');
        str.add('l');
        str.add('l');
        str.add('o');

        Vector<Character> reversedStr = reverseString(str);

        for (char c : reversedStr) {
            System.out.print(c);
        }
        System.out.println();
    }

}