class Solution {
    public String firstPalindrome(String[] words) 
    {
        int n=words.length;
        String r="";
        for(int i=0;i<n;i++)
        {
            StringBuilder sb=new StringBuilder(words[i]);
            String rev=new String(sb.reverse());
            if(words[i].equals(rev))
            {
                r=words[i];
                break;
            }
        }
        return r;
    }
}