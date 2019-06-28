import java.util.Arrays;

public class leetcode0628_2{
    public int coinChange(int[] coins, int amount) {
    	int[] dp=new int[amount+1];
    	Arrays.fill(dp,amount+1);
    	dp[0]=0;
    	for(int i=1;i<amount+1;i++)
    		for(int j=0;j<coins.length;j++)
    			if(coins[j]<=i)
    				dp[i]=Math.min(dp[i], dp[i-coins[j]]+1);
    	return dp[amount]>amount?-1:dp[amount];       
    }
	public static void main(String args[]) {
		int[] coins= {1,2,5};
		int amount=11;
		leetcode0628_2 test = new leetcode0628_2();;
		int result=test.coinChange(coins, amount);
		System.out.print(result);
	}
}