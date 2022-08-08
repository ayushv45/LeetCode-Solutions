class Solution {
    int ans = -1;
    public int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        peak(nums,s,e);
        return ans;
    }
    
        void peak(int[] nums , int s, int e)
        {
            if(s>e)
                return;
            int mid = s +(e-s)/2;
            long left = mid-1>=0?nums[mid-1]:Long.MIN_VALUE;
            long right = mid+1<nums.length?nums[mid+1]:Long.MIN_VALUE;
            if(nums[mid]>left && nums[mid]>right)
            {
                ans = mid;
                return;
            }
         peak(nums,s,mid-1);
         peak(nums,mid+1,e);
        }
}