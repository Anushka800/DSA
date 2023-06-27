//https://practice.geeksforgeeks.org/problems/perfect-numbers3207/0
//https://leetcode.com/problems/perfect-number/

class Solution {
    public boolean checkPerfectNumber(int num) {
        
        long sum = 1;

        for(long i=2;i*i<=num;i++){

            if(num%i == 0){
                sum = sum + i + (num/i);
            }

        }

       

        if(sum == num && num!=1){

            return true;

        }
        return false;
        
    }
}