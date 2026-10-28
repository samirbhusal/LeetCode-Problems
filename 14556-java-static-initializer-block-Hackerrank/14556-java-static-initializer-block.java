import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
        Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int b = sc.nextInt();
        int h = sc.nextInt();
        
        if(b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be 
        } else {
            positive");
        
        
            System.out.println(b*h);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna