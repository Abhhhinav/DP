package DP;
import java.util.*;
public class climbStairs {
    public static int countWays(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = countWays(n - 1, ways) + countWays(n - 2, ways);
        return ways[n];
    }

    public static int CountTAB(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        // tabulation loop
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 2] + dp[i - 1];
            }
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(countWays(n, ways));
        System.out.println(CountTAB(n));
    }

}
