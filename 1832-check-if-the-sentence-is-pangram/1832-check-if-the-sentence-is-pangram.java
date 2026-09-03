class Solution {
    public boolean checkIfPangram(String sentence) {

        Set<Character> set= new HashSet<>();

        for(char ch: sentence.toCharArray()){
            set.add(ch);
        }

        return set.size()==26;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna