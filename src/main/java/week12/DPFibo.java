package week12;

public class DPFibo {
    public static void main(String[] args) {
        int n = 40;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
