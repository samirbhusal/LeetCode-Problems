class Solution {
    static boolean isAnagram(String s, String t) {
        Map<Character, Integer> freqMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(char c : s.toCharArray()){
          int count = freqMap.getOrDefault(c, 0);
          freqMap.put(c, count+1);
        }

        for(char c : t.toCharArray()){
          int count = freqMap.getOrDefault(c, 0);
          if(count <= 0){
            return false;
          }
          freqMap.put(c, count - 1);
        }
        return true;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna