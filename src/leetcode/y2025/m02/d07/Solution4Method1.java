package leetcode.y2025.m02.d07;

class Solution4Method1 {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3,5,6,7,8,9}, new int[]{2, 4}));
    }

    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int first = nums1.length;
        int second = nums2.length;
        int left = 0 ,right = 0 ,nums1Start = 0,nums2Start = 0;
        int middle = (first + second) >>> 1;
        for(int i = 0 ; i <= middle ; i++){
            left = right;
            if( nums1Start < first && ( nums2Start >= second || nums1[nums1Start] < nums2[nums2Start])){
                right = nums1[nums1Start++];
            }else {
                right = nums2[nums2Start++];
            }
        }
        if(((first + second) & 1) == 0){
            return (left+right)/2.0;
        }else {
            return right;
        }
    }
}