package Greedy;

import java.util.Arrays;

public class AssignCookies_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int i = 0, j = 0;
        while (j < s.length && i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                res++;
            }
        }
        return res;

    }
}
