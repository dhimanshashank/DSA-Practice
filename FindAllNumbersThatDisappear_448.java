//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

//Example 1:
//  Input: nums = [4,3,2,7,8,2,3,1]
//  Output: [5,6]

//Example 2:
//  Input: nums = [1,1]
//  Output: [2]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllNumbersThatDisappear_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int index = -1;

        for (int num : nums) {
            if(num < 0){
                index = num*-1-1;
            } else{
                index = num-1;
            }

            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                ans.add(i+1);
            }
        }

        return ans;
    }
}
