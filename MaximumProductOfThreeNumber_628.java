//Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

//Example 1:
//  Input: nums = [1,2,3]
//  Output: 6

//Example 2:
//  Input: nums = [1,2,3,4]
//  Output: 24

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumProductOfThreeNumber_628 {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}
