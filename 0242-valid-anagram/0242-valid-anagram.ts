function isAnagram(s: string, t: string): boolean {
    let wordMap = new Map<string, number>();
    if(s.length != t.length) 
        return false;

    for(const char of s){
        const charCount = wordMap.get(char) ?? 0;
        wordMap.set(char, charCount+1);
    }

    for(const char of t){
        const count = wordMap.get(char) ?? 0;
        if (count === undefined || count === 0){
            return false;
        }
        wordMap.set(char, count - 1);
    } 
    return true;
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna