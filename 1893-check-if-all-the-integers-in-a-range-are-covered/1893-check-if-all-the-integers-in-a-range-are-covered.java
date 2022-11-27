class Solution {
    public boolean isCovered(int[][] range, int left, int right) {
        int n = 52;
        
        int[] arr = new int[n];
        int[] prefix = new int[n];
        for(int i=0;i<range.length;i++)
        {
            arr[range[i][0]] += 1;
            arr[range[i][1] +1] -= 1;
        }
        
        prefix[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            prefix[i] += prefix[i-1] + arr[i];
        }
        
        for(int i=left;i<=right;i++)
        {
            if(prefix[i]<1)
                return false;
        }
        return true;
    }
}