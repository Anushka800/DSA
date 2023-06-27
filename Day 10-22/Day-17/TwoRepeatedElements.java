//https://practice.geeksforgeeks.org/problems/two-repeated-elements-1587115621/0
//User function template for JAVA

class Solution {
    // Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int N) {
        int[] ans = new int[2];
        int[] digitCount = new int[N+1];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            digitCount[arr[i]]++;
            if(digitCount[arr[i]]==2)
            {
                ans[j]=arr[i];
                j++;
            }
        }
        return ans;
        
    }
}

       