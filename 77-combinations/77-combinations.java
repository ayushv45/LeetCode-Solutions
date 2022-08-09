class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combine(1 , n , k , list , ans);
        return ans;
    }
    void combine(int i , int n , int k , List<Integer> list , List<List<Integer>> ans)
    {
        if(list.size() == k)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        while(i<=n)
        {
            list.add(i);
            combine(i+1 , n , k , list , ans);
            list.remove(list.size()-1);
            i++;
        }
            
    }
}