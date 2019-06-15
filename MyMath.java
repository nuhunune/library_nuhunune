
public class MyMath {

    static String primeFactrization(int input) {
        long firstn = input;
        long n = firstn;
        String ans = "";
        for (long i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                ans += i + "x";
                n /= i;
            }
        }
        if (n == 1) {
            ans = ans.substring(0, ans.length() - 1);
        } else {
            ans += n;
        }
        System.out.println(firstn + "=" + ans);
        return ans;
    }
}
