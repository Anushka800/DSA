//Practice Link : https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int rd=0;
        for(int i=1;i<N;i++){
            if(A[rd]!=A[i]){
                rd++;
                A[rd]=A[i];
            }
        }
        return rd+1;
    }
}
