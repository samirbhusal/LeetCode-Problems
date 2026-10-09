class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        int len = arr.length;
        
        
        for(int i = 0; i < len; i++){
            int original = arr[i];
            int num = original;
            int rev = 0;
            
            while(num > 0){
                int lastDigit = num % 10;
                rev = (rev*10) + lastDigit;
                num = num / 10;
            }
            
            if(original != rev){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna