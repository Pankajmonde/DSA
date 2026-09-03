class Solution {
    public int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

       
        for (int num : nums) {

            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int answer = -1;
        int maxFrequency = 0;

        
        for (int num : map.keySet()) {

            int frequency = map.get(num);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                answer = num;
            }

            
            else if (frequency == maxFrequency && num < answer) {
                answer = num;
            }
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna