class Solution {
    public int maximumDifference(int[] nums) 
    {
        int max=-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(nums[j]<nums[i])
                {
                max=Math.max(max,nums[i]-nums[j]);
                }
            }
        }
        
        return max;
    }
}