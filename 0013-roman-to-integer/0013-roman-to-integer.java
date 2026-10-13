class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> lookUp = new HashMap<>();
        lookUp.put('I', 1);
        lookUp.put('V', 5);
        lookUp.put('X', 10);
        lookUp.put('L', 50);
        lookUp.put('C', 100);
        lookUp.put('D', 500);
        lookUp.put('M', 1000);

        int len = s.length();
        int sum = 0;
        int left = 0;
        int right = 0;

        if (len <= 1){
            sum = lookUp.get(s.charAt(len-1));
            return sum;
        }

        for(int i = 0; i < len - 1; i++){
            left = lookUp.get(s.charAt(i));
            right = lookUp.get(s.charAt(i+1));
            if(right > left){
                sum -= left;
            } else {
                sum += left;
            }
        }

        sum = sum + lookUp.get(s.charAt(len-1));

        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna