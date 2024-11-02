package Hashing;

import java.util.*;;

public class LConsecutive {

    public static int longestConsecutive(int[] arr) {

        Arrays.sort(arr);

        int max = 0, count = 0, last = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (last == arr[i] - 1) {
                last = arr[i];
                count++;
            } else if (arr[i] != last) {
                count = 1;
                last = arr[i];
            }

            max = Math.max(max, count);

        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = { 100, 4, 200, 1, 3, 2 };

        System.out.println(longestConsecutive(arr));

    }
}
