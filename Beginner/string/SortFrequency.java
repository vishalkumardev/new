import java.util.ArrayList;
import java.util.List;

public class SortFrequency {
    public static List<Character> frequencySort(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        List<Character> freq = new ArrayList<>();
         
        for (Character character : s) {
            freq.add(character);
        }
        return freq;

    }

    public static void main(String[] args) {

        String s = "tree";

        System.out.println(frequencySort(s));

    }
}
