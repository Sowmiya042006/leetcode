class Solution {
    public int removeDuplicates(int[] nums) 
    {
       int a[]=nums;
       int prev=a[0];
       int index=1;
       for(int i=1;i<a.length;i++)
       {
          if(prev!=a[i])
          {
            nums[index++]=a[i];
            prev=a[i];
          }
       }
       return index;
    }
}