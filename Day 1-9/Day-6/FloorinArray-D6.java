//Practice Link : https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/0
class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int s= 0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(x<arr[mid]){
                e=mid-1;
            }
            else if(x>arr[mid]){
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return e;
    }
    
}