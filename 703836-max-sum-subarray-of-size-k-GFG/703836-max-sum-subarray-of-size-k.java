class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int len = arr.length; //4
        
        int windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum +=arr[i]; 
        } //
        
        int maxSum = windowSum;
        
        for(int i = 1; i <= len - k; i++){
           windowSum = windowSum - arr[i-1] + arr[i+k-1];
           if(windowSum > maxSum){
               maxSum = windowSum;
           }
        }
        return maxSum;
        }
        
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna