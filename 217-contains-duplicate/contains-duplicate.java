class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        boolean b=false;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                b=true;
            }
            set.add(nums[i]);
        }
        return b;
    }
}