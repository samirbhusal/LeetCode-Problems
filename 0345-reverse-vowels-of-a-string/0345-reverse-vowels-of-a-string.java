class Solution {
    public String reverseVowels(String s) {
        
        if(s.length() <= 0){
            return "";
        }

        char[] word = s.toCharArray();

        
        int len = word.length;

        int left = 0;
        int right = len - 1;

        while(left < right){
            if(isVowel(word[left]) && isVowel(word[right])){
                char temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                left++;
                right--;
            } 
            if(!isVowel(word[right]) && right > left){
                right--;
            }
            if(!isVowel(word[left]) && left < right){
                left++;
            }
        }

        return new String(word);
    }
       private static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) >= 0;
     }
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna