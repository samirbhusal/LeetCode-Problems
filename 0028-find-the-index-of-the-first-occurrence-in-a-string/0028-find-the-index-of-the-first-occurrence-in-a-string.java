class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        if(hLen < nLen){
            return -1;
        }
        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            while (j < nLen) {
                char hChar = haystack.charAt(i + j);
                char nChar = needle.charAt(j);
                if (hChar != nChar) {
                    break;
                }
                j++;
            }
            if (j == nLen) {
                return i;
            }
        }
        return -1;
    }
}