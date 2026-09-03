class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map  = new HashMap<>();

        for( int i=0; i< nums.length; i++){
            int temp= target-nums[i];

            if(map.containsKey(temp)){
                return new int[]{i, map.get(temp)};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[]{-1, -1};












    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna