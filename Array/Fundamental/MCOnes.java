package Array.Fundamental;

public class MCOnes {
    public static int search(int[] arr, int key) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
                if (max < count) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 1, 1, 0 };

        System.out.println(search(arr, 5));

    }
}
