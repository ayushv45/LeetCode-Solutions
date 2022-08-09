class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combination(0,candidates,target,list,ans);
        return ans;
    }
    void combination(int i , int[] candidates, int target , List<Integer> list , List<List<Integer>> ans)
    {
        if(i == candidates.length)
        {
           if(target == 0)
            {
            ans.add(new ArrayList<>(list));
            
            } 
            return;
        }
        if(candidates[i]<=target)
        {
            list.add(candidates[i]);
            combination(i,candidates,target-candidates[i],list,ans);
            list.remove(list.size()-1);
        }
        combination(i+1,candidates,target,list,ans);
    }
}