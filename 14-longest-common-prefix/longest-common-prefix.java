class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        String r="";
        String t=strs[0];
        String s="";
        int j=0;
        for(int i=1;i<strs.length;i++)
        {
            j=0;
            s="";
            while(j<strs[i].length() && j<t.length())
            {
                if(strs[0].charAt(j)==strs[i].charAt(j))
                {
                    s=s+strs[i].charAt(j);
                    j++;
                }
                else
                {
                    break;
                }
            
            }
            t=s;
        }
        return t;
    }
}