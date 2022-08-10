class Solution {
    public int rob(int[] nums) {
       int[] dp = new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int pick = nums[i];
            if(i>1)
                pick += dp[i-2];
            
            int notpick = dp[i-1];
            dp[i] = Math.max(pick , notpick);
        }
       return dp[nums.length-1];
    }
   
}