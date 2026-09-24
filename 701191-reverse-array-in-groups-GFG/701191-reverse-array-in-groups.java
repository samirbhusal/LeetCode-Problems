class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int len = arr.length;
        
        for(int i = 0; i < len; i+=k){
            int end  = Math.min(i+k-1, len-1);
            reverse(arr, i, end);
        }
        
    }
    
    public void reverse(int[] arr, int start, int end){
        int len = arr.length;
        
        while(start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna