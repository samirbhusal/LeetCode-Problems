class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        if(txt.contains(pat)){
            return txt.indexOf(pat);
        }
        
        return -1;
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna