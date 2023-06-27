//https://leetcode.com/problems/squares-of-a-sorted-array/
class Solution {
    public int[] sortedSquares(int[] nums) {
       //Arrays.sort(nums);
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] * nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}