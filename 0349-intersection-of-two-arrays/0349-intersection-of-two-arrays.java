class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for(int num : nums1){
            firstSet.add(num);
        }

        for(int num : nums2){
            if(firstSet.contains(num)){
                intersect.add(num);
            }
        }

        int[] arr = new int[intersect.size()];
        int index = 0;

        for(int num : intersect){
            arr[index++] = num;
        }

        return arr;


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna