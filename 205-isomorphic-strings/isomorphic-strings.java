class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        char ch1[]=new char[256];
        char ch2[]=new char[256];
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            if(ch1[s.charAt(i)]==0 && ch2[t.charAt(i)]==0)
            {
            ch1[s.charAt(i)]=t.charAt(i);
            ch2[t.charAt(i)]=s.charAt(i);
            }
            else if(ch1[s.charAt(i)]!=t.charAt(i) || ch2[t.charAt(i)]!=s.charAt(i))
            {
                return false;
            }

        }
        return true;
    }
}