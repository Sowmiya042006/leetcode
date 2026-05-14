class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int result[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int p=nums.length-1;
        while(left<=right)
        {
           int l=nums[left]*nums[left];
           int r=nums[right]*nums[right];
           if(r>l)
           {
            result[p]=r;
            right--;
           }
           else 
           {
            result[p]=l;
            left++;
           }
           p--;
        }
        return result;
    }
}