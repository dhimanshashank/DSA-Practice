//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

//Example 1:
//  Input: nums = [1,2,3,1], k = 3
//  Output: true

//Example 2:
//  Input: nums = [1,0,1,1], k = 1
//  Output: true

//Example 3:
//  Input: nums = [1,2,3,1,2,3], k = 2
//  Output: false


import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2_219 {
    private int abs(int a){
        return (a < 0) ? -a : a;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;

        Set<Integer> slidingWindow = new HashSet<>();
        for (int index = 0; index < nums.length; index++) {
            if (slidingWindow.contains(nums[index]))
                return true;
            if (index >= k)
                slidingWindow.remove(nums[index - k]);
            slidingWindow.add(nums[index]);
        }
        return false;
    }

//     TLE
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            j = i + 1;
//            if(nums[i] == nums[j] && abs(i - j) <= k){
//                return true;
//            }
//        }
//        return false;
//    }
}
