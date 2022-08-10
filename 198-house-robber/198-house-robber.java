class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
        
        for(int i=1;i<n;i++)
        {
            int pick = nums[i];
            if(i>1)
                pick += prev2;
            int notpick = prev;
            int max = Math.max(pick , notpick);
            prev2 = prev;
            prev = max;
        }
        return prev;
    }
   
}