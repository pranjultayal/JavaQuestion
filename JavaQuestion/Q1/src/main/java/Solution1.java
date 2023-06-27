public class Solution1 {

    public static int balancedSum(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int index = 0; index < nums.length; index++) {
            if (totalSum - leftSum - nums[index] == leftSum) {
                return index;
            }
            leftSum += nums[index];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 6};
        System.out.println(balancedSum(arr1));
    }
}
