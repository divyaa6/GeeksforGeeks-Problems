// User function Template for Java
class Solution {
    int solve(int ind,int[] height,int[] dp){
        if(ind==0)return 0;
        
        if(dp[ind]!=-1)return dp[ind];
        
        int left=Math.abs(height[ind]-height[ind-1])+solve(ind-1,height,dp);
        int right = Integer.MAX_VALUE;
        
        if(ind>1){
            right=Math.abs(height[ind]-height[ind-2])+solve(ind-2,height,dp);
        }
        return dp[ind]=Math.min(left,right);
    }
    int minCost(int[] height) {
        // code here
        int n=height.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n-1,height,dp);
        
    }
}