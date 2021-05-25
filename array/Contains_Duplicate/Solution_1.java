package array.Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution_1 {
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		return set.size() != nums.length;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 1, 2 };
		System.out.println(containsDuplicate(nums));
	}
}