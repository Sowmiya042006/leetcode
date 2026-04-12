class Solution {
    public boolean canAliceWin(int n) 
    {
    
        int i=0;
        int a=10;
        while(n>0)
        {
            if(n<a)
            {
                return i%2!=0;
            }
            n=n-a;
            a--;
            i++;
        }
        return (i-1)%2==0;
    }
}