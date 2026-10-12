class Solution {
    public int lengthOfLastWord(String s) {
        String[] strArr = s.split("\\s+");
        String lastWord = strArr[strArr.length-1];
        return lastWord.length();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna