class Solution {
    public int pivotIndex(int[] nums) 
    {
        int left[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
          left[i]=sum;
          sum=sum+nums[i];
        }
        int right[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
          right[i]=sum-nums[i];
          sum=sum-nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(left[i]==right[i])
            {
                return i;
            }
        }
        return -1;
    }
}