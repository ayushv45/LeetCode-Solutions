class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
        return Math.max(maxrob(nums,0,n-2),maxrob(nums,1,n-1)); 
    }
    int maxrob(int[] nums, int start , int end)
    {
        int prev = nums[start];
        int prev2 = 0;
        for(int i=start+1;i<=end;i++)
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