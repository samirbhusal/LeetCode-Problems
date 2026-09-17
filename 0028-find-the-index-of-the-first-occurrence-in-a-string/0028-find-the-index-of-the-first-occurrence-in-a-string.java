class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            for (int j = 0; j < nLen; j++) {
                char hChar = haystack.charAt(i + j);
                char nChar = needle.charAt(j);
                if (hChar != nChar) {
                    break;
                }
                if (j == nLen - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna