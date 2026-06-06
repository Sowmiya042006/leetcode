class Solution {
    public int[] findDegrees(int[][] matrix) 
    {
        int k=0;
        int n=matrix.length;
        int r[]=new int[n];
        int sum=0;
        while(k<n)
        {
          sum=0;
          for(int i=0;i<n;i++)
          {
            sum=sum+matrix[i][k];
          }
          r[k++]=sum;

        }
        return r;
    }
}