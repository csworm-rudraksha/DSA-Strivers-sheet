package Array;

public class CheckifArrayIsSortedandRotated_752 {
    public boolean check(int[] nums) {
        int n = nums.length;
        int dropCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                dropCount++;
            }

            // If there is more than one drop, return false
            if (dropCount > 1) {
                return false;
            }
        }
        return true;
    }

}
