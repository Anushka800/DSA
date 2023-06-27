//https://practice.geeksforgeeks.org/problems/divisible-numbers1521/0
class Solution{
    static long find(long A,long B){  
        // code here
        for(long x=A+1;; x++){
            if( x%B==0){
                return x;
            }
        }
        
       
    } 
}