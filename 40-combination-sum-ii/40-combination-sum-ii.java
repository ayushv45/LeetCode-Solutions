class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,candidates,target,list,ans);
        return ans;
    }
    void combination(int ind , int[] candidates, int target , List<Integer> list , List<List<Integer>> ans)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(list));
            return;
        } 
        for(int i=ind;i<candidates.length;i++)
        {
          if(i>ind && candidates[i] == candidates[i-1])
              continue;
          if(candidates[i]>target)
               break;
            
            list.add(candidates[i]);
            combination(i+1,candidates,target-candidates[i],list,ans);
            list.remove(list.size()-1);
        }    
    }
}