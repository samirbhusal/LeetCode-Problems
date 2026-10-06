class Solution {
    public boolean repeatedSubstringPattern(String s) {
         int len = s.length();

        for (int i = len / 2; i > 0; i--){
            if(len % i == 0){
                String sub = s.substring(0,i);
                
                int rep = len / i;
                
               if(sub.repeat(rep).equals(s)){
                return true;
               }
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna