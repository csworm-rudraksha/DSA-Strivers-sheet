package Array;

public class SearchInAnElementInASortedArray {
    static int searchInSorted(int arr[], int N, int K)
    {

        // Your code here
        for(int n: arr){
            if(n==K){
                return 1;
            }
        }
        return -1;

    }
}
