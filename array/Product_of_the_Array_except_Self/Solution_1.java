package array.Product_of_the_Array_except_Self;

import java.util.Arrays;

public class Solution_1 {

	public static int[] productExceptSelf(int[] nums) {
		int inputArrayLength = nums.length;
		int[] left = new int[inputArrayLength];
		int[] right = new int[inputArrayLength];

		left[0] = 1;
		right[inputArrayLength - 1] = 1;

		for (int i = 1; i < inputArrayLength; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}

		for (int i = inputArrayLength - 2; i >= 0; i--) {
			right[i] = right[i + 1] * nums[i + 1];
		}

		for (int i = 0; i < inputArrayLength; i++) {
			nums[i] = left[i] * right[i];
		}

		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] output = productExceptSelf(nums);
		System.out.println(Arrays.toString(output));
	}
}