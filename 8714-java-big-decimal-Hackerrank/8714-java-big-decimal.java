

        //Write your code here
 Arrays.sort(s, 0, n, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        BigDecimal x = new BigDecimal(a);
        BigDecimal y = new BigDecimal(b);
        return y.compareTo(x);
    }
});


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna