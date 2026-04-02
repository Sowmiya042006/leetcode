class Solution {
    public int minChanges(int n, int k) 
    {
        String s1=Integer.toBinaryString(n);
        String s2=Integer.toBinaryString(k);
        String r="";
        int c=0;
        int max=Integer.max(s1.length(),s2.length());
        while(s1.length()<max)
        {
            s1='0'+s1;
        }
        while(s2.length()<max)
        {
            s2='0'+s2;
        }
        for(int i=0;i<max;i++)
        {
            if(s1.charAt(i)=='1' && s2.charAt(i)=='0')
            {
                c++;
            }
            else if(s1.charAt(i)=='0' && s2.charAt(i)=='1')
            {
                return -1;
            }
        }
        return c;
    }
}