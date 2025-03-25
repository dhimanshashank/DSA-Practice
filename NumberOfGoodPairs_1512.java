// 1512. Number of Good Pairs       ------>     25th March,2025

//Given an array of integers nums, return the number of good pairs.
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.

//Example 1:
//    Input: nums = [1,2,3,1,1,3]
//    Output: 4
//    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

//Example 2:
//      Input: nums = [1,1,1,1]
//      Output: 6
//      Explanation: Each pair in the array are good.

//Example 3:
//      Input: nums = [1,2,3]
//      Output: 0

import java.util.HashMap;

public class NumberOfGoodPairs_1512 {
//      Optimized approach
        public int numIdenticalPairs(int[] nums) {
            HashMap<Integer, Integer> frequency = new HashMap<>();
            int count = 0;
            for (int num : nums) {
                int currentFrequency = frequency.getOrDefault(num, 0);
                count += currentFrequency;
                frequency.put(num, currentFrequency + 1);
            }
            return count;
        }


    /*
    * This is the brute force solution
    * */
//    public int numIdenticalPairs(int[] nums) {
//        int count = 0, n = nums.length;
//
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                if(nums[i] == nums[j])   count++;
//            }
//        }
//
//        return count;
//    }
}
