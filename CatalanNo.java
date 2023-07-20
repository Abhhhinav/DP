package DP;
// import java.util.*;
public class CatalanNo {
//     public static int Cat(int n, int dp[]) {

//         if (n == 0 || n == 1) {
//             return 1;
//         }

//         if (dp[n] != -1) {
//             return dp[n];
//         }

//         int ans = 0;
//         for (int i = 0; i < n; i++) {
//             ans += Cat(i, dp) * Cat(n - i - 1, dp);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int n = 0;
//         int dp[] = new int[n + 1];
//         Arrays.fill(dp,-1);
//         System.out.println(Cat(n, dp));
//     }
// }

// Tabulation

public static int Cat(int n){
    int dp[] = new int[n+1];
    dp[0] = 1;
    dp[1] = 1;
    for(int i=2;i<=n;i++){
        for(int j =0;j<i;j++){
            dp[i]+= dp[j] * dp[i-j-1];
        }
    }return dp[n];
}

  public static void main(String[] args) {
     System.out.println(Cat(4));
  }
}