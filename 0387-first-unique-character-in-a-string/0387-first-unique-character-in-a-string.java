class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        Map<Character, Integer> counts = new HashMap<>();

        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            counts.put(c, counts.getOrDefault(c,0)+1);
        }

        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(counts.get(c) == 1){
                return i;
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna