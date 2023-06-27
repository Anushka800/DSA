//Practice Link : https://practice.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long arr[]=new long[2];
        Arrays.sort(a);
       long min1=a[0],min2=a[0];
        for(int i=1;i<n;i++){
            if(min2<a[i]){
                min2=a[i];
                break;
            }
        }
        if(min1!=min2){
            arr[0]=min1;
            arr[1]=min2;
        }
        else{
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
    }
}
