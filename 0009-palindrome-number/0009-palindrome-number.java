class Solution {
    public boolean isPalindrome(int x) {

        if (x<0) {
            return false ;
        }
        int orignal=x;
        int reverse=0;
        while(x>0) {
            int digit= x % 10;
            reverse =reverse * 10 + digit;
            x= x / 10;

        }
        return orignal == reverse;
      
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna