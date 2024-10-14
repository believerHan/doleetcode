package leetcode.y2024.m10.d08;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, Integer> hashMap = new HashMap();
        for (List<String> path : paths) {
            if (hashMap.containsKey(path.get(0))) {
                hashMap.remove(path.get(0));
            } else {
                hashMap.put(path.get(0), -1);
            }
            if (hashMap.containsKey(path.get(1))) {
                hashMap.remove(path.get(1));
            } else {
                hashMap.put(path.get(1), 1);
            }
        }
        for (String s : hashMap.keySet()) {
            if(hashMap.get(s)==1)
                return s;
        }
        return null;
    }
}