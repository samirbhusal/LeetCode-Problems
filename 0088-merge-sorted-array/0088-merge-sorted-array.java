class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n <= 0) System.out.println(nums1);
        if(m == 0 && n == 1) {
            nums1[0] = nums2[0];
            System.out.println(nums1);
        }

        int len = m+n;

        for(int i = m; i < len; i++){
            nums1[i] = nums2[i-m];
        }

        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna