class Solution 
{
    public static int unique(int[] nums)
    {
        int a[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(a[nums[i]]==1 && nums[i]%2==0)
            {
                return nums[i];
            }
        }
        return -1;
    }

    public int firstUniqueEven(int[] nums) 
    {
        int even=-1;
        ArrayList<Integer>list=new ArrayList<>();
        return unique(nums);
    }
}