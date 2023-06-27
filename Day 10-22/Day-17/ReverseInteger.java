//https://leetcode.com/problems/reverse-integer/
class Solution {
    public int reverse(int x) {
        long ans = 0;
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            ans = ans * 10 + digit;
        }
        
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0; // Return 0 if reversed value overflows the integer range
        }
        
        return (int) ans;
    }
}
