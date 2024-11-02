package language_basic;

public class sum_last_first {

    public static int sumOfFirstAndLast(int[] nums) {
        int sum = nums[0] + nums[nums.length - 1];
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 6 };

        System.out.println(sumOfFirstAndLast(nums));

    }
}
