import java.math.BigInteger;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            String s = sc.next();
            BigInteger n = new BigInteger(s);

            boolean fits = false;

            if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0 ||
                n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                System.out.println(s + " can't be fitted anywhere.");
                continue;
            }

            System.out.println(s + " can be fitted in:");

            if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                System.out.println("* byte");
                fits = true;
            }
            if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                System.out.println("* short");
                fits = true;
            }
            if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                System.out.println("* int");
                fits = true;
            }
            System.out.println("* long"); // because we already ensured it fits in long
        }

        sc.close();
    }
}
