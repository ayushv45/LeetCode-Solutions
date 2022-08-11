class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(map.containsKey(key))
            {
                map.get(key).add(strs[i]);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            }
        }
            ans.addAll(map.values());
        return ans;
    }
}