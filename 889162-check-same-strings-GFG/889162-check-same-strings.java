class Solution {
    public static boolean areStringsSame(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        
        if (s1.trim() == s2.trim()) return true;
        
        for(int i =0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna