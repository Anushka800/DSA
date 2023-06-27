//https://practice.geeksforgeeks.org/problems/bubble-sort/0
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for (int i = 0; i < n - 1; i++){
    
      
      for (int j = 0; j < n - i - 1; j++){

        // compare two adjacent elements
        // change > to < to sort in descending order
        if (arr[j] > arr[j + 1]) {

          // swapping occurs if elements
          // are not in the intended order
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
        return;
    }
}