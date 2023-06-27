//https://practice.geeksforgeeks.org/problems/selection-sort/0
/ class Solution
// {
// 	int  select(int arr[], int i)
// 	{
//         // code here such that selectionSort() sorts arr[]
// 	}
	
// 	void selectionSort(int arr[], int n)
// 	{
// 	    //code here
// 	}
// }

class Solution
{
    void selectionSort(int arr[], int n)
    {
        for(int i =0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxindex = getMaxIndex(arr,0,last);
            swap(arr, maxindex, last);
        }
    }
    
    void swap(int arr[], int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
        }
        
    int getMaxIndex(int arr[], int start, int end){
        int max = start;
        for(int i = 0; i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}