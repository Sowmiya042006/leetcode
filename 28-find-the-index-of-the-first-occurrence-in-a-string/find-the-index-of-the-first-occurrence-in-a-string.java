class Solution {
    public int strStr(String haystack, String needle) 
    {
        int l=haystack.length()-needle.length();
        for(int i=0;i<=l;i++)
        {
            String s=haystack.substring(i,i+needle.length());
            if(s.equals(needle))
            {
                return i;
            }
            
        }
        return -1;
        
    }
}