class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j] == '1')
                {
                    dfs(grid , i , j);
                    count++;
                }
            }
        }
        return count;
    }   
    void dfs(char[][]grid, int r , int c)
    {
        if(r<0 || r>=grid.length || c<0 || c>=grid[r].length || grid[r][c] == '0')
        {
            return;
        }
        grid[r][c] = '0';
        
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
}