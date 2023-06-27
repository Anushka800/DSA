// Practice Link: https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int max1 = arr[0];
        for (int i = 1; i < n; i++) {
            max1 = Math.max(max1, arr[i]);
        }

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max1) {
                max2 = Math.max(max2, arr[i]);
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            return -1;
        } else {
            return max2;
        }
    }
}