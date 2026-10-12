class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] > nums[i]){
                isIncreasing = false;
            }
            if(nums[i-1] < nums[i]){
                isDecreasing = false;
            }

            if(!isIncreasing && !isDecreasing){
                return false;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna