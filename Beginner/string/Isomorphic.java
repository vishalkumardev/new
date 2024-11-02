public class Isomorphic {
    public static boolean isomorphicString(String s, String t) {
        int[] smap = new int[256];
        int[] tmap = new int[256];

        for (int i = 0; i < s.length(); i++) {

            if (smap[s.charAt(i)] != tmap[t.charAt(i)]) {
                return false;
            }

            smap[s.charAt(i)] = i + 1;
            tmap[t.charAt(i)] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "paper";
        String t = "title";

        System.out.println(isomorphicString(s, t));
    }
}
