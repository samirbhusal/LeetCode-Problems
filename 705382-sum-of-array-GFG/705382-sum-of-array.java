class Solution {
    public int arraySum(int arr[]) {
        // code here
        int len = arr.length;
        int sum = 0;
        
        for(int i = 0; i < len; i++) {
            sum +=arr[i];
        }
        return sum;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna