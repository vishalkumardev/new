package Sorting;

public class Selection {
    public static void sort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; i < nums.length - 1; j++) {
                if (nums[j] < nums[minPos]) {
                    minPos = j;
                }
            }

            if (minPos != i) {
                int temp = nums[i];
                nums[i] = nums[minPos];
                nums[minPos] = temp;
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 1, 5, 3 };

        sort(arr);

        for (Integer ele : arr) {
            System.out.println(ele);
        }
    }
}
