//https://practice.geeksforgeeks.org/problems/reverse-coding2452/0
class Solution {
    static int sumOfNaturals(int n) {
        // code here
        long sum=0;
        long ans = 0;
        for(long i=0;i<=n;i++){
            sum = sum+i;
            ans = sum % (1000000007); 
        }
        return (int) ans;
    }
};