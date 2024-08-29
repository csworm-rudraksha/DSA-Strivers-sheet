package Array;
import java.util.*;
public class MajorityElementII_229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        int expFreq = n/3;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > expFreq) {
                ans.add(entry.getValue());
            }
        }
        return ans;

    }
}
