package leetcode.y2025.m02.d18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
//--2080
class RangeFreqQuery {
    public static void main(String[] args) {
        RangeFreqQuery rangeFreqQuery = new RangeFreqQuery(new int[]{12, 33, 4, 4, 4, 2, 34, 33, 22, 12, 34, 56});
        System.out.println(rangeFreqQuery.query(1, 5, 4));
    }

    private HashMap<Integer, List<Integer>> hashMap = new HashMap<>();

    public RangeFreqQuery(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            hashMap.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }
    }

    public int query(int left, int right, int value) {
        if (!hashMap.containsKey(value)) {
            return 0;
        }
        List idx = hashMap.get(value);
        int l = Collections.binarySearch(idx, left);
        l = l < 0 ? -l - 1 : l;
        int r = Collections.binarySearch(idx, right + 1);
        r = r < 0 ? -r - 1 : r;
        return r - l;
    }

}
