class Solution {
    public int trap(int[] height) 
    {
        int water=0;
        int n=height.length;
        Stack<Integer>st=new Stack<>();
        st.push(height[n-1]);
        for(int i=n-2;i>=2;i--)
        {
            st.push(Math.max(st.peek(),height[i]));
        }
        int leftmax=height[0];
        for(int i=1;i<n-1;i++)
        {
           int minheight=Math.min(leftmax,st.pop());
           water=water+Math.max(0,minheight-height[i]);
           leftmax=Math.max(leftmax,height[i]);
        }
        return water;
    }
}