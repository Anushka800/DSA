// Practice Link : https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i=0;i<n;i=i+k){
            int s =i;
            int e = Math.min(i+k-1,n-1);
            
            //reverse logic
            while(s<e){
                int temp = arr.get(s);
                arr.set(s,arr.get(e));
                arr.set(e,temp);
                s++;
                e--;
                //Collections.swap(arr,s++,e--);
            }
        }
    }
}
