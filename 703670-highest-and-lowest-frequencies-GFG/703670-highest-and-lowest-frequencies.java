class Solution {
    public int findDiff(int[] arr) {
        // code here
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for(int num : arr){
            int count = freqMap.getOrDefault(num,0);
            freqMap.put(num, count+1);
        }
        
        int high = Collections.max(freqMap.values());
        int low = Collections.min(freqMap.values());
        
        return high - low;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna