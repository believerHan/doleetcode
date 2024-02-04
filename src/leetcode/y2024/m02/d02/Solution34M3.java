package leetcode.y2024.m02.d02;

import java.util.Arrays;

/**
 * 从左到右，当左边大于右边的时候，说明遍历完毕.
 *               当   mid > target ,这个时候 将 Right = mid - 1 。 因为 mid 这个点已经不等于 target 所以直接排除，
 *               同理  mid < target , Left = mid + 1 .
 *             理解一  在 mid == target 时候，将 first = mid,因为当前 mid 的左边可能还有节点的值为target，所以我们将范围更新为 [LEFT,mid -1],也就是 Right = mid -1.
 *            (补充解释)  在 mid == target 时候，假设是只有一个节点，那么该节点就是左节点。将 first = mid 。然后直接return 跳出这个 while 不需要判断剩下的数据.
 *                    但是现在是可能多个节点，左节点一定是在 <=当前节点，所以我们只要看 left 到 mid-1 这个范围的数据是否还有等于 target的值，所以我们将 Right = mid -1。
 *                       如果这个时候有Mid,那么还会继续 Right = mid -1，如果没有那么target, 由于，Right = mid -1。所以 Right下标的值会小于 target，
 *                       这个时候剩下的循环都会走分支 mid < target , Left = mid + 1,导致 left一直向右移动,最终 left > Right,跳出循环。
 */
class Solution34M3 {
    public static void main(String[] args) {
        int[] ints = searchRange(new int[]{0, 1, 2, 2, 3, 4, 5, 5, 5, 5, 7, 8, 9}, 5);
        System.out.println(Arrays.toString(ints));
    }


    public static int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = -1, second = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                first = mid;
          //      right = mid - 1;
            }
        }
        if (first == -1) {
            return new int[]{first, first};
        }
        left = first;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                second = mid;
        //        left = mid + 1;
            }
        }
        return new int[]{first, second};
    }


}