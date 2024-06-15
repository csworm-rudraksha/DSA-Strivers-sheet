package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElememts_169 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int mElement = n/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > mElement) {
                return entry.getKey();
            }
        }
        return -1;
        //moores  voting Algorithm
//        int num = nums.length;
//        int cnt = 0; // count
//        int el = 0; // Element
//
//        //applying the algorithm:
//        for (int i = 0; i < num; i++) {
//            if (cnt == 0) {
//                cnt = 1;
//                el = nums[i];
//            } else if (el == nums[i]) cnt++;
//            else cnt--;
//        }
//
//        //checking if the stored element
//        // is the majority element:
//        int cnt1 = 0;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] == el) cnt1++;
//        }
//
//        if (cnt1 > (n / 2)) return el;
//        return -1;

    }
}
