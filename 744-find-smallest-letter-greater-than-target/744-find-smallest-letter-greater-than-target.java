class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;
        
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(letters[mid]-target > 0)
            {
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return s < letters.length ? letters[s] : letters[0];
    }
}