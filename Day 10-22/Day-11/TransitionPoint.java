//https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/0
class GfG {
    int transitionPoint(int arr[], int n) {
        if(arr[n-1]==0){
            return -1;
        }
        if(arr[0]==1){
            return 0;
        }
        int start = 0;
        int end = n - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == 1 && arr[mid - 1] == 0) {
                return mid;
            } else if (arr[mid] == 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1; // No transition point found
        
        
    }
}
