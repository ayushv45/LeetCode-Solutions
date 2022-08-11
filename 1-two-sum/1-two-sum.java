class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int n = nums[i];
            int diff = target-n;
            if(map.containsKey(n))
            {
                int j = map.get(n);
                return new int[]{j,i};
            }
            map.put(diff,i);
        }
        return new int[]{-1,-1};
    }
}