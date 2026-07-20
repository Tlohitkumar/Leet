1979. Find Greatest Common Divisor of Array
Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

Example 1:

Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.

class Solution {
    public int findGCD(int[] nums) {
        // int minValue = Integer.MAX_VALUE;
		// int maxValue = Integer.MIN_VALUE;
		// for(int n : nums) {
		// 	minValue = Math.min(minValue, n);
		// 	maxValue = Math.max(maxValue, n);
		// }
		
		//  while (maxValue != 0) {
	    //         int rem = minValue % maxValue;
	    //         minValue = maxValue;
	    //         maxValue = rem;
	    //     }
	    //     return minValue;

        int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		for(int n : nums) {
			minValue = Math.min(minValue, n);
			maxValue = Math.max(maxValue, n);
		}
		
		 while (minValue != 0) {
	            int rem = maxValue % minValue;
	            maxValue = minValue;
	            minValue = rem;
	        }
	        return maxValue;

    }
}