class Solution {
    public int countOdds(int low, int high) 
    {
        int c=0;
        int n=high-low+1;
        if(n%2==0)
        {
            return n/2;
        }
        else if(n%2!=0 && low%2!=0 && high%2!=0)
        {
            return n/2+1;
        }
        return n/2;
    }
}