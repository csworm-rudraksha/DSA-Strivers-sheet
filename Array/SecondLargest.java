package Array;

public class SecondLargest {
    int print2largest(int arr[], int n) {
        if(n==0){
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0;i < n;i++)
        {
            large = Math.max(large,arr[i]);
        }
        for (int i = 0;i < n;i++)
        {
            if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        return second_large;
    }
}
