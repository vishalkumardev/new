package Array.Fundamental;

public class Linear {

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 8, 7, 6, 5 };

        System.out.println(search(arr, 5));

    }
}
