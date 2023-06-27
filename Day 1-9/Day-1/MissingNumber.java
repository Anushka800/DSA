// Practice Link:https://practice.geeksforgeeks.org/problems/missing-number4257/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=missing-number
class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         // Your code goes here
         //Arrays.sort(A);
         int sum=(N*(N+1))/2;
         int sum1=0;
         for(int i=0;i<N-1;i++){
             //sum=Math.abs(sum-A[i]);
             sum1=sum1+A[i];
         }
         if(sum!=sum1){
             return sum - sum1;
         }
         return -1;
    }
}