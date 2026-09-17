class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int len = arr.length;
        d = d % len;
        reverseArr(arr, 0, d - 1);
        reverseArr(arr, d, len-1);
        reverseArr(arr, 0, len-1);
        
    }
    
    static void reverseArr(int arr[], int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            right--;
            left++;
        }
    }
    
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna