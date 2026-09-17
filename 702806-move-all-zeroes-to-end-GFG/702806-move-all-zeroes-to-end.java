class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int insertPos = 0;
        int len = arr.length;
        
        for(int i = 0; i < len; i++){
            if(arr[i] > 0) {
                
                int temp = arr[insertPos];
                arr[insertPos] = arr[i];
                arr[i] = temp; 
                insertPos++;
            }
            
            
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna