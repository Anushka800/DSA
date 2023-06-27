//GFG: https://practice.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/0
//Leetcode : https://leetcode.com/problems/single-element-in-a-sorted-array/
class Solution 
{
    int findOnce(int arr[], int n)
    {
        //1st method 
        // Complete this function
        // if(n==1){
        //     return arr[0];
        // }
        // if(arr[0]!=arr[1]){
        //     return arr[0];
        // }
        // if(arr[n-1]!=arr[n-2]){
        //     return arr[n-1];
        // }
        // int low=1;
        // int high=n-2;
        // while(low<=high){
        //     int mid = (low + high)/2;
        //     if(arr[mid]!=arr[mid+1]&&arr[mid]!=arr[mid-1]){
        //         return arr[mid];
        //     }
        //     if((mid%2==1 &&arr[mid]==arr[mid-1])||(mid%2==0 && arr[mid]==arr[mid+1])){
        //         low = mid+1;
        //     }
        //     else{
        //         high=mid-1;
        //     }
        // }
        // return -1;
        
        
        //O(n) solution
    //   if (n == 1) {
    //         return arr[0];
    //     }

    //     for (int i = 0; i < n; i++) {
    //         if (i == 0 && arr[i] != arr[i + 1]) {
    //             return arr[i];
    //         } else if (i == n - 2 && arr[i] != arr[i + 1]) {
    //             return arr[i];
    //         } else if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
    //             return arr[i];
    //         }
    //     }

    //     return -1;


    //2nd method
    for(int i=0;i<n-1;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
      
        return arr[n-1];
    
    }
}