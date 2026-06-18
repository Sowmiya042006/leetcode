class Solution {
    public boolean checkRecord(String s) 
    {
        char[] ch=s.toCharArray();
        int a=0;
        int l=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='A')
            {
                a++;
                l=0;
            }
            else if(ch[i]=='L')
            {
                l++;
            }
            else
            {
                l=0;
            }
            if(a>=2 || l>=3)
            {
                return false;
            }

        }
        return true;
    }
}