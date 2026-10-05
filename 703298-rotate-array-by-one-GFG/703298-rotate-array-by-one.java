class Solution {
    public void rotate(int[] arr) {
        // code here
        int len = arr.length;
        int last = arr[len - 1];
        
        for(int i = len - 1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        
        arr[0] = last;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna