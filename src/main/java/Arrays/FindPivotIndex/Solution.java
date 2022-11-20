package Arrays.FindPivotIndex;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    public int pivotIndex(int[] nums) {
        int left = 0;
        for (int i=0; i<nums.length; i++) {
            int right = 0;
            left += nums[i];
            for (int j = i; j< nums.length; j++) {
                right += nums[j];
            }
            if (left == right) {
                return i;
            }
        }
        return -1;
    }


}