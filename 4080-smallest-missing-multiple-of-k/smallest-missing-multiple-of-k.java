class Solution {
    public int missingMultiple(int[] nums, int k) 
    {
        Arrays.sort(nums);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        int ans=0;
        int j=1;
        while(j<=1000)
        {
            if(!list.contains(j) && j%k==0)
            {
                ans=j;
                break;
            }
            j++;
        }
        return ans;
    }
}