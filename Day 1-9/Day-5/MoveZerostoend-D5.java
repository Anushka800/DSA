//Practice Link : https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=move-all-zeroes-to-end-of-array
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
     int nz=0;
     int z=0;
     while(nz<n){
         if(arr[nz]!=0){
             int temp=arr[nz];
             arr[nz]=arr[z];
             arr[z]=temp;
             nz++;
             z++;
             
         }
         else{
             nz++;
         }
     }
     return ;
    }
}
