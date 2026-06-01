class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            list.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(list.contains(nums1[i]))
            {
                set.add(nums1[i]);
            }
        }
        int r[]=new int[set.size()];
        int k=0;
        for(int i:set)
        {
           r[k++]=i;
        }
        return r;
    }
}