function searchInsert(nums: number[], target: number): number {
    let low: number = 0
    let high: number = nums.length - 1;
    let mid: number;
    while(low<=high){
    mid = Math.floor((low+high)/2);
       if(nums[mid] == target){
        return mid;
       } else if (nums[mid] > target){
        high = mid - 1;
       } else {
        low = mid + 1;
       }
       
    }
    return low;
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna