package Array;

public class LargestElementinArray {

    //To find the largest number in the array
    public int largest(int arr[], int n)
    {
         // Arrays.sort(arr);     sorting takes 0(NlogN)
         //return arr[n-1];
        if(n==0){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        for(int num : arr){
            largest = Math.max(largest,num);
        }
        return largest;
    }
}
