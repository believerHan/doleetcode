package leetcode.y2024.m02.d22;

class Solution567 {
    /**
     * s2 是否包含 s1 的排列,s1 和 s2 仅包含小写字母
     */
    public boolean checkInclusion(String s1, String s2) {

        int s1l = s1.length(), s2l = s2.length();
        int[] cnt = new int[26];
        for (int i = 0; i < s1l; i++) {
            cnt[s1.charAt(i) - 'a']++;
        }
        int l = 0, r = 0;
        while (r < s2l) {

            cnt[s2.charAt(r) - 'a']--;
            while (cnt[s2.charAt(r) - 'a'] < 0) {
                cnt[s2.charAt(l) - 'a']++;
                l++;
            }
            if (r - l + 1 == s1l) {
                return true;
            }
            r++;
        }
        return false;
    }
}