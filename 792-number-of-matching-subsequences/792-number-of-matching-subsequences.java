class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count =0;
        for(String word : words)
        {
            if(isSubSeq(s,word))
                count++;
        }
        return count;
    }
    private boolean isSubSeq(String s , String word)
    {
        int prevIndex =0;
        for(char ch : word.toCharArray())
        {
            int index = s.indexOf(ch , prevIndex);
            if(index == -1)
                return false;
            prevIndex = index +1;
        }
        return true;
    }
}