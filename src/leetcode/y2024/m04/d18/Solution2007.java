package leetcode.y2024.m04.d18;

import java.util.Arrays;
import java.util.HashMap;

class Solution2007 {
    public static void main(String[] args) {
        System.out.println(findOriginalArray(new int[]{0,28,72,0,62,16,88,20,10,68,18,66,36,86,86,56,43,0,84,45,88,48,44,8,62,20,60,94,31,30,42,48,40,44,17,84,12,54,24,9,0,28,96,16,96,4,2,84,29,44,27,32,0,28,90,94,94,56,60,46,0,34,42,84,4,42,40,54,31,45,50,48,10,34,47,43,42,22,20,27,58,90,14,8,47,28,18,36,18,14,24,23,0,47,30,36,80,0,33,25}));
    }

    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 == 1) {
            return new int[]{};
        }
        Arrays.sort(changed);
        int l = 0, r = 1;
        int[] org = new int[changed.length / 2];
        boolean[] rw = new boolean[changed.length];
        int i = 0;
        if(changed[changed.length-1]==0){
            return new int[changed.length/2];
        }
        while (l < changed.length - 1 && r < changed.length) {
            if(changed[l]==0){
                if(changed[r]==0){
                    org[i++] = changed[l];
                    l++;
                    l++;
                    r++;
                    r++;
                    continue;
                }else {
                    return new int[]{};
                }
            }
            if (changed[l] == (double)changed[r] / 2) {
                org[i++] = changed[l];
                rw[r] = true;
                while(rw[++l]==true&&l<changed.length-1){
                }
                r++;

            } else {
                r++;
            }
        }
        if (i != org.length) {
            return new int[]{};
        }
        return org;
    }
}