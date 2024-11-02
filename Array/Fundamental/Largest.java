package Array.Fundamental;

public class Largest {
    public static int search(int[] arr, int key) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 8, 7, 6, 5 };

        System.out.println(search(arr, 5));

    }
}
