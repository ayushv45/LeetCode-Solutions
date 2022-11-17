//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> isConnected, int V) {
        boolean[] vis = new boolean[V];
        int count =0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<vis.length;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.size();i++)
        {
            for(int j=0;j<isConnected.get(i).size();j++)
            {
                if(isConnected.get(i).get(j) == 1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        for(int i=0;i<vis.length;i++)
        {
            if(!vis[i])
            {
                dfs( i , adj , vis);
                count++;
            }
        }
        return count;
    }
    static void dfs(int node , ArrayList<ArrayList<Integer>> adj, boolean[] vis)
    {
        vis[node] = true;
        for(int it : adj.get(node))
        {
            if(!vis[it])
            {
                dfs(it,adj,vis);
            }
        }
    }
}