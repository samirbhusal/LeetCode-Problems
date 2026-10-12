class Solution {
    public int arraySign(int[] nums) {
        long product = 1;

        for(int num : nums) {
            product = product * num;
        }

        if(product > 0){
            return 1;
        } else if(product == 0){
            return 0;
        } 

        return -1;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna