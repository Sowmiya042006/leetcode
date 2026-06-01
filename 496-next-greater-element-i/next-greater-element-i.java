class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int r[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
           Stack<Integer>st=new Stack<>();
           for(int j=nums2.length-1;j>=0;j--)
           {
             if(nums1[i]!=nums2[j] && nums2[j]>nums1[i])
             {
               st.push(nums2[j]);
             }
             else if(nums1[i]==nums2[j])
             {
                break;
             }
           }
           if(!st.isEmpty())
           {
            r[i]=st.peek();
           }
           else
           {
            r[i]=-1;
           }
        }
        return r;

    }
}