class Solution {
    public String reverseWords(String s) 
    {
        String str[]=s.split(" ");
        String ans="";
        for(int i=0;i<str.length;i++)
        {
            StringBuilder sb=new StringBuilder(str[i]);
            sb.reverse();
            ans=ans+sb+" ";
        }
        return ans.trim();
    }
}