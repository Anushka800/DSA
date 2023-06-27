//https://practice.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x0849/0
//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        pair p = new pair(-1,-1);
        
        int s = 0;
        int e = v.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (v[m] == x) {
                p.first = m;
                e = m - 1;
            } else if (x > v[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        
        // second occurrences
        s = 0;
        e = v.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (v[m] == x) {
                p.second = m;
                s = m + 1;
            } else if (x > v[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return p;
    }
}