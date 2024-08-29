package Array;

import java.util.HashMap;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return new int[]{mpp.get(moreNeeded), i};
            }

            mpp.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
