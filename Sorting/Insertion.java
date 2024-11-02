package Sorting;

public class Insertion {
    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int curr = i;
            while (curr > 0) {
                if (arr[curr] < arr[curr - 1]) {
                    int temp = arr[curr];
                    arr[curr] = arr[curr - 1];
                    arr[curr - 1] = temp;
                }
                curr--;
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { 8, 8, 7, 6, 5 };

        sort(arr);

        for (Integer ele : arr) {
            System.out.println(ele);
        }
    }
}
