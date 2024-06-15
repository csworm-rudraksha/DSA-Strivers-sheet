package Arrays;
import java.util.*;
public class MissingNumber_268 {
    public static void main(String[] args) {
        int arr[]={1,3,4};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int sum=0;
        int expectedSum = n * (n + 1) / 2;
        for( int num: nums){
            sum+=num;
        }
        return expectedSum-sum;

    }
}
