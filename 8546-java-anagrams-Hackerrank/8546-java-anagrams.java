Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        if(a.length() != b.length() || a == null || b == null){
            System.out.println("Not Anagrams");
        } else {
        
        char[] aChar = a.toLowerCase().toCharArray();
        char[] bChar = b.toLowerCase().toCharArray();
        
        Arrays.sort(aChar);
        Arrays.sort(bChar);
     
        if(Arrays.equals(aChar, bChar)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
            return;
        }
        }
        sc.close();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna