class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++ ){
                
                if(arr[i]+arr[j] == 0){
                    ArrayList<Integer> row = new ArrayList<>();
                    row.add(Math.min(arr[i], arr[j]));
                    row.add(Math.max(arr[i], arr[j]));
                    
                    if(!matrix.contains(row)){
                        matrix.add(row);
                    }
                }
            }
            
        }
        matrix.sort((pair1, pair2) -> {
            int firstComparison = Integer.compare(pair1.get(0), pair2.get(0));
            
            if(firstComparison != 0){
                return firstComparison;
            }
            
            return Integer.compare(pair1.get(1), pair2.get(1));
        });
        
        return matrix;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna