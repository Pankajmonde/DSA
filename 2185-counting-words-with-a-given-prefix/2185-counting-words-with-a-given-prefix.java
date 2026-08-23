class Solution {
    public int prefixCount(String[] words, String pref) {
    int count =0;
    for(int i=0; i<words.length; i++){
        if (words[i].startsWith(pref)){
            count++;
        }
    }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna