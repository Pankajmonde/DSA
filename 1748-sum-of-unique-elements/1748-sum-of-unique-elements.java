class Solution {
    public int sumOfUnique(int[] nums) {


        HashMap<Integer, Integer> map= new HashMap<>();

        for( int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);

        }
        int sum =0;
        for(int key: map.keySet()){
            if(map.get(key)==1)
            sum+=key;
        }
         return sum;
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna