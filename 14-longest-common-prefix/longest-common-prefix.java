class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs==null || strs.length==0)
        {
            return "";
        }
        String temp=strs[0];
        String s="";
        int j;
        for(int i=1;i<strs.length;i++)
        {
            j=0;
            s="";
            while(j<temp.length()&& j<strs[i].length())
            {
            if(temp.charAt(j)==strs[i].charAt(j))
            {
               s=s+temp.charAt(j);
               j++;
            }
            else
            {
                break;
            }
            }
            temp=s;

           
        }
        return temp;
    }
}