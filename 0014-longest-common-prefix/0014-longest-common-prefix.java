class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length <= 0){
            return "";
        }

        Arrays.sort(strs);

        String firstStr = strs[0];
        String lastStr = strs[strs.length-1];
        int len = (firstStr.length() <= lastStr.length()) ? firstStr.length() : lastStr.length();
        StringBuilder prefix = new StringBuilder("");

        for(int i = 0; i < len; i++){
            if(firstStr.charAt(i) != lastStr.charAt(i)){
                return prefix.toString();
            }
            prefix.append(firstStr.charAt(i));
        }

        return prefix.toString();

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna