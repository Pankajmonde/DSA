class Solution {
    public int missingNumber(int[] nums) {
         int n =nums.length;
         int result=n;

         for(int i=0; i<n; i++){
            result =result ^ i ^ nums[i];
         }
         return result;

    //      HashSet<Integer> set = new HashSet<>();

    //      for( int num : nums){
    //         set.add(num);
    //      }

    //      for(int i= 0; i<=nums.length; i++){
    //         if(!set.contains(i)){
    //             return i;
    //         }
    
    //      }
    //    return -1;
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna