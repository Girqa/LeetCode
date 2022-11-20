package BinarySearch.FirstBadVersion;

public class Solution {
    private int bad = 1;

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.firstBadVersion(1));
    }

    private boolean isBadVersion(int version) {
        return version == bad;
    }
    public int firstBadVersion(int n) {
        int leftBorder = 0;
        int rightBorder = n;

        while (leftBorder < rightBorder) {
            int midVersion = leftBorder + (rightBorder - leftBorder)/2;
            if (isBadVersion(midVersion) == true) {
                rightBorder = midVersion;
            }
            else {
                leftBorder = midVersion + 1;
            }
        }
        return leftBorder;
    }
}
