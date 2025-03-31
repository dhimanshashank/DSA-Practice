//Given a binary array nums, return the maximum number of consecutive 1's in the array.

//Example 1:
//  Input: nums = [1,1,0,1,1,1]
//  Output: 3
//  Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

//Example 2:
//  Input: nums = [1,0,1,1,0,1]
//  Output: 2

public class MaxConsecutiveOnes_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0, maxCount = 0;

        for(int i : nums){
            if(i == 1){
                currCount++;
                maxCount = Math.max(maxCount, currCount);
            } else{
                currCount = 0;
            }
        }
        return maxCount;
    }
}
