//https://practice.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/0
lass Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
        // Arrays.sort(arr);
        // return arr[0];
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
        return s;
    }
}
