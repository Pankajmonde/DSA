class Solution {
    public int[][] transpose(int[][] matrix) {

         int r = matrix.length; int c=matrix[0].length;

       int ans[][]= new int[c][r];

       for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            ans[j][i]=matrix[i][j];
        }
       }
     return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna