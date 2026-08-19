class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {

        int n=arr.length;
        // flip
        for (int i = 0; i < n; i++) {
         for (int j = 0; j < n/2; j++) {
            //swap
            int temp=arr[i][j];
            arr[i][j]=arr[i][n-1-j];
            arr[i][n-1-j]=temp ;
             
         }   
        }
        //invert 
        for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
           if(arr[i][j]==1)
               arr[i][j]=0;
            else 
                arr[i][j]=1;
              
         }   
        }
        return arr;


        
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna