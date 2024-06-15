package Arrays;

public class MaxConsecutiveOnes_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ctn=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ctn++;
                max=Math.max(ctn,max);
            }
            else{
                ctn=0;
            }
        }
        return max;
    }
}
