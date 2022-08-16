class Solution {
    public int findMin(int[] arr) {
        if(arr.length == 1)
            return arr[0];
        if(arr[0]<arr[arr.length-1])
            return arr[0];
        int s = 0;
        int e = arr.length-1;
        while(s<e)
        {
            int mid = s+(e-s)/2;
            if(arr[mid]>arr[mid+1])
                return arr[mid+1];
            
            if(arr[mid]<arr[mid-1])
                return arr[mid];
            
            if(arr[mid]>arr[0])
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        } 
        return -1;
    }
}