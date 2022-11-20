package BinarySearch.BinarySearch;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 2;
        System.out.println(s.search(nums, target));
    }

    public int search(int[] nums, int target) {

        int leftBorder = 0, rightBorder = nums.length-1;
        while (leftBorder <= rightBorder) {
            int midIndex = leftBorder + (rightBorder - leftBorder) / 2;
            if (target < nums[midIndex]) {
                rightBorder = midIndex-1;
            } else if (target > nums[midIndex]) {
                leftBorder = midIndex+1;
            } else {
                return midIndex;
            }
            System.out.println(leftBorder);
            System.out.println(rightBorder);
        }
        return -1;
    }
}
