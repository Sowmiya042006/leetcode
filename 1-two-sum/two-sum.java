class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
       int sum=0;
       int r[]=new int[2];
       int k=0;
       for(int i=0;i<nums.length;i++)
       {
        sum=0;
        for(int j=i+1;j<nums.length;j++)
        {
           sum=nums[i]+nums[j];
           if(sum==target)
          {
            r[k++]=i;
            r[k++]=j;
           }
        }
        
       }
       return r;
    }
}