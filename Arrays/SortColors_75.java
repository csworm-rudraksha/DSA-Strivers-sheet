package Arrays;

import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortColors_75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int n : nums){
            q.add(n);
        }
        System.out.println();
    }
    public void sortColors(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int n : nums){
            set.add(n);
        }
        set.toArray();
        System.out.println(set);
    }
}
