package Arrays;

import java.util.*;

public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        HashSet <Integer> s=new HashSet<>();
        ArrayList< Integer > Union=new ArrayList<>();
        for (int i = 0; i < n; i++)
            s.add(arr1[i]);
        for (int i = 0; i < m; i++)
            s.add(arr2[i]);
        for (int it: s)
            Union.add(it);
        Collections.sort(Union);
        return Union;

    }
}
