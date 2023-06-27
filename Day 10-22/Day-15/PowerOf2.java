//https://leetcode.com/problems/power-of-two/
//https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/0
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }else if(n==1){
            return true;
        }else if(n%2==0 && isPowerOfTwo(n/2)){
            return true;
        }else
        return false;
    }
}