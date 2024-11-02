public class ValidAnagram {

    public static boolean isValid(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (char i : str1.toCharArray()) {
            arr[i - 'a']++;
        }
        for (char i : str2.toCharArray()) {
            arr[i - 'a']--;
        }

        for (Integer i : arr) {
            if (i != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";

        System.out.println(isValid(str1, str2));
    }
}
