package Array;

import java.util.HashMap;

public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
//        brutteforce

//        for(int i=0;i<nums.length;i++){
//            int num = nums[i];
//            int ctn=0;
//            for (int j=0;j<nums.length;j++){
//                if (num == nums[j]){
//                    ctn++;
//                }
//            }
//            if (ctn == 1){
//                return num;
//            }
//        }
//        return -1;

          //second approach
//        int n = nums.length;
//
//        int maxi = nums[0];
//        for (int i = 0; i < n; i++) {
//            maxi = Math.max(maxi, nums[i]);
//        }
//        int[] hash = new int[maxi + 1];
//        for (int i = 0; i < n; i++) {
//            hash[nums[i]]++;
//        }
//        for (int i = 0; i < n; i++) {
//            if (hash[nums[i]] == 1)
//                return nums[i];
//        }
//        return -1;

          //third approach
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (hashMap.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
