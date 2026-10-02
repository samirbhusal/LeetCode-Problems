class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        int majority = nums.length / 2;

        for(int num : nums){
            int newCount = count.getOrDefault(num, 0) + 1;
            count.put(num, newCount);

            if(newCount > majority){
                return num;
            }
        }
        throw new IllegalStateException("Majority element does not exist");
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna