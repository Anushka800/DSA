//https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/0
class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long[] fib=new long[n];
        fib[0]=1;
        if(n==1){
            return fib;
        }
        fib[1]=1;
        for(int i=2;i<n;i++){
            fib[i]=fib[i-2]+fib[i-1];
        }
        return fib;
        }
        
    
}