public class LeftRotArrOne {

    public static int search(int[] arr, int key) {

        int temp = arr[i];

        for (int i = 1; i < arr.length; i++) {
          int tempR = nums[i-1];
          nums[i-1] = nums[i];
          nums[i] = nums[tempR];
        }

        arr[arr.length - 1] = temp;
        
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(search(arr, 5));

    }
}
