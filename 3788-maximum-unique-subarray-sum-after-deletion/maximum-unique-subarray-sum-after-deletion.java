class Solution {
    public int maxSum(int[] nums) 
    {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>nlist=new ArrayList<>();
        int sum=0;
        int negative=0;
        int nsum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!list.contains(nums[i]) && nums[i]>0)
            {
                list.add(nums[i]);
                sum=sum+nums[i];
            }
            else if(!list.contains(nums[i]) && nums[i]<=0)
            {
                negative++;
                nlist.add(nums[i]);
            }
        }
        Collections.sort(nlist);
        if(negative==nums.length)
        {
            return nlist.get(nlist.size()-1);
        }
        return sum;

    }
}