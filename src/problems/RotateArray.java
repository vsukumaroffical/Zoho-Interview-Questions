package problems;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 5;
		System.out.println("Before rotate :" + Arrays.toString(nums));
		rotate(nums, k);
		System.out.println("After rotate  :" + Arrays.toString(nums));

	}

	private static void rotate(int[] nums, int k) {
		int n = nums.length;
		if ((k = k % n) == 0)
			return;

		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);

	}

	private static void reverse(int[] nums, int start, int end) {

		while (start < end) {
			nums[start] = nums[start] + nums[end];
			nums[end] = nums[start] - nums[end];
			nums[start] = nums[start] - nums[end];
			start++;
			end--;
		}

	}

}
