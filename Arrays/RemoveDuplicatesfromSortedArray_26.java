package Arrays;

public class RemoveDuplicatesfromSortedArray_26 {
    public static int removeDuplicates(int[] nums) {
//        int prv = Integer.MIN_VALUE;
//        int elm=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i] == prv){
//                continue;
//            }
//            prv = nums[i];
//            elm++;
//        }
//        return elm;
        if (nums.length == 0) {
            return 0;
        }
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
