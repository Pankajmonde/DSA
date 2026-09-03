class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character>set = new HashSet<>();

        for( char ch: jewels.toCharArray()){
            set.add(ch);
        }
        int c=0;
        for( char ch: stones.toCharArray()){
            if(set.contains(ch))
                c++;
            
        }
        return c;


    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna