class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> charsMap = new HashMap<Character, Integer>();
        
        for(char ch : s.toCharArray()){
            charsMap.put(ch, charsMap.getOrDefault(ch, 0)+1);
        }

        System.out.print(charsMap);

        for(char ch : t.toCharArray()){
            int count = charsMap.getOrDefault(ch, 0);
            if (count > 0){
                charsMap.put(ch, count -1);
            } else {
                return ch;
            }
            
        }

        return ' ';
}
}