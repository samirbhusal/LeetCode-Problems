import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalindrome = true;
        /* Enter your code here. Print output to STDOUT. */
        int left = 0;
        int right = A.length() - 1;
        while (left <= right){
            if(A.charAt(left) != A.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        System.out.println(isPalindrome ? "Yes" : "No");
        
        
    }
}





// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna