class Solution {
    public boolean isPalindrome(String s) {
      String cleanStr = s.toLowerCase().replaceAll("[^a-z0-9]","");  
      int left = 0;
      int right = cleanStr.length() - 1;

      while(left <= right){
        char leftChar = cleanStr.charAt(left);
        char rightChar = cleanStr.charAt(right);
        if (leftChar != rightChar){
            return false;
        }
        left++;
        right--;
      }
      return true;
    }
}