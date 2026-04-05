class Solution {
    public void moveZeroes(int[] nums) 
    {
    
       for(int j=0;j<nums.length;j++)
       {
        int i=0;
       while(i<nums.length-1)
       {
        if(nums[i]==0)
        {
            int t=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=t;
            
        }
        i++;
        
       }
       }
        
    }
}