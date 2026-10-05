class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder newS = new StringBuilder();
        int len = s.length();
        
        for(int i = len -1; i>=0; i--){
           newS.append(s.charAt(i));
        }
        
        return newS.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna