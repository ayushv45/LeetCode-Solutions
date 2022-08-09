class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutation(nums , list , ans , freq);
        return ans;
    }
    void permutation(int[] nums , List<Integer> list ,  List<List<Integer>> ans , boolean[] freq)
    {
        if(list.size() == nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i] = true;
                list.add(nums[i]);
                permutation(nums , list , ans , freq);
                list.remove(list.size()-1);
                freq[i] = false;
            }
        }
    }
}