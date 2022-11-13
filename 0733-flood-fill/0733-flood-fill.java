class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initial_color = image[sr][sc];
        fill(image,sr,sc,color,initial_color);
        return image;
    }
    void fill(int[][] image, int sr, int sc, int color , int  initial_color)
    {
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[sr].length || image[sr][sc] != initial_color || image[sr][sc] == color)
        {
            return;
        }
        if(image[sr][sc] == initial_color)
        {
            image[sr][sc] = color;
        }
        fill(image,sr+1,sc,color,initial_color);
        fill(image,sr-1,sc,color,initial_color);
        fill(image,sr,sc+1,color,initial_color);
        fill(image,sr,sc-1,color,initial_color);
    }
}