class Solution {
    public static boolean checkPangram(String s) {
        // code here
              String noSpacesStr = s.replaceAll("[ ,]", "").toLowerCase();
              char[] charArr = noSpacesStr.toCharArray();

              Set<Character> alphabets = new HashSet<>();

              for(char c : charArr){
                alphabets.add(c);
              }

              for (char c = 'a'; c <= 'z'; c++) {
                          if (!alphabets.contains(c)) {
                              return false;
                          }
                      }
                      return true;
              }
              
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna