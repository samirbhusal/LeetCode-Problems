class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            
            for(int j = i; j < arr.length; j++){
                List<Integer> subList = new ArrayList<>();
                
                for(int k = i; k <= j; k++){
                    subList.add(arr[k]);
                }
                list.add(subList);
            }
        }
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna