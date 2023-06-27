//Practice Link https://leetcode.com/problems/remove-element/
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        //int[] temp = new int[n];
        int rd = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[rd] = nums[i];
                rd++;
            }
        }
        
        return rd;
    }
}

