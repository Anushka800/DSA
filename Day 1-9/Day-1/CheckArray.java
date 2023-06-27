// Practice Link: https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted
class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
      for(int i=0;i<n-1;i++){  //0  0<4   1<4   2<4  3<4 
          if(arr[i]>arr[i+1]){ // 10>20   20>30   30>40   40>50 
              return false;
          }
      }
      return true ;       
    }
}