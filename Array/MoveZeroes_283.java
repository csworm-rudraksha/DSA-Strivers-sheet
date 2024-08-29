package Array;
import java.util.*;
public class MoveZeroes_283 {
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>(nums.length);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                list.add(nums[i]);
            }
        }
        int leftelmt = nums.length-list.size();
        for(int i=0;i<=leftelmt;i++){
            nums[i] = list.get(i);
        }
        for (int i=leftelmt+1;i<nums.length;i++){
            nums[i]=0;
        }

    }
}
