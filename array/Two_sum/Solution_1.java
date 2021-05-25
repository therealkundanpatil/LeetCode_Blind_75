package array.Two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution_1{
	
	public static int[] computeTwoSum(int[] nums, int target) {
		int[] result = {0,0};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				result[0] = i;
				result[1] = map.get(complement);
			}
			else {
				map.put(nums[i], i);
			}
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		
		int[] answer = computeTwoSum(nums, target);
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
	}
}