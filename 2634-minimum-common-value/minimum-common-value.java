class Solution {
    public int getCommon(int[] nums1, int[] nums2) 
    {
        HashSet<Integer>set=new HashSet<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums2.length;i++)
        {
            set.add(nums2[i]);
        }
        boolean b=false;
        for(int i=0;i<nums1.length;i++)
        {
            if(set.contains(nums1[i]) && nums1[i]<min)
            {
                min=nums1[i];
                b=true;
            }
        }
        if(!b)
        {
            return -1;
        }
        return min;
    }
}