class Solution {
    public int findMiddleIndex(int[] arr) {
        int n = arr.length;
        if(n==1)
            return 0;
        for(int i=1;i<n;i++)
        {
            arr[i] = arr[i] + arr[i-1];
        }
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                if(arr[n-1] - arr[i] == 0)
                    return i;
            }
            else if( i>0 && i<n-1)
            {
                if(arr[i-1] == (arr[n-1]-arr[i]))
                    return i;
            }
            else
            {
                if(arr[i-1] == 0)
                    return i;
            }
        }
        return -1;
    }
}