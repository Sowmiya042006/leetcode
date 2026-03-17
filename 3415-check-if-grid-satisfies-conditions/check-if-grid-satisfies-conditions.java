class Solution {
    public boolean satisfiesConditions(int[][] grid) 
    {
        int row=grid.length;
        int col=grid[0].length;
        int r=0;
        int c=0;
        for(int i=0;i<row-1;i++)
        {
            for(int j=0;j<col;j++)
            {
               if(grid[i][j]==grid[i+1][j])
               {
                   r++;
               }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col-1;j++)
            {
               if(grid[i][j]!=grid[i][j+1])
               {
                  c++;
               }
            }
        }
        if(r==(row-1)*col && c==row*(col-1))
        {
            return true;
        }
       return false;
    }
}