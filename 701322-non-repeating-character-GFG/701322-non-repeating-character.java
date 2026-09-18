class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int len = s.length();
        Map<Character, Integer> count = new HashMap<>();
        
        for(char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0)+1);
        }
        
        for(char c : s.toCharArray()){
            if(count.get(c) == 1){
                return c;
            }
        }
        
        return '$';
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna