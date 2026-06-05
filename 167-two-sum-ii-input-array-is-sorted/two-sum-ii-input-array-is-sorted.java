class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int i=0;
        int j=numbers.length-1;
        int r[]=new int[2];
        int k=0;
        while(i<=j)
        {
            int sum=numbers[i]+numbers[j];
            if(sum==target)
            {
                r[k++]=i+1;
                r[k]=j+1;
                break;
            }
            else if(sum>target)
            {
                j--;
            }
            else
            {
                i++;
            }

        }
        return r;
    }
}