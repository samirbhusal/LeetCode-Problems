class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> intersect = new ArrayList<>();

        for(int n : nums1){
            int count = map.getOrDefault(n, 0) + 1;
            map.put(n, count);
        }

        for(int n : nums2){
            int count = map.getOrDefault(n, 0);
            if(count > 0){
                intersect.add(n);
                map.put(n, count - 1);
            }
        }

        int[] arr = new int[intersect.size()];
        int index = 0;

        for(int n : intersect) {
            arr[index++] = n;
        }

    return arr;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna