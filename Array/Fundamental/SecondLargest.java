package Array.Fundamental;

public class SecondLargest {
    public static int search(int[] arr, int key) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 8, 7, 6, 5 };

        System.out.println(search(arr, 5));

    }
}
