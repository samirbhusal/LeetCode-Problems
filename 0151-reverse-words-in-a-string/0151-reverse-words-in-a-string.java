class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        Collections.reverse(words);

        return String.join(" ", words);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna