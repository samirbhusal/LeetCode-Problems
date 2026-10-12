class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = Math.abs(arr[0] - arr[1]);
        for(int i = 1; i < arr.length - 1; i++){
            int newdiff = Math.abs(arr[i]-arr[i+1]);
            if(diff != newdiff){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna