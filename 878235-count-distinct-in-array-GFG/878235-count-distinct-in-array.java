class Solution {
    public int countDistinct(int arr[]) {
        // code here
        Map<Integer, Integer> countMap = new HashMap<>();
        int count = 0;
        
        for(int num : arr){
            int n = countMap.getOrDefault(num, 0);
            if(n == 0){
                countMap.put(num, n+1);
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna