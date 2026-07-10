import java.util.*;
class Solution {
    public int findMaxK(int[] nums) 
    {
        int max=-1;
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
      
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0 && set.contains(-nums[i]))
            {
                max=Math.max(nums[i],max);
            }
        }
        return max;
    }
}