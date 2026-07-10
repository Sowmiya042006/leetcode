class Solution {
    public boolean isCircularSentence(String sentence) 
    {
        String[] s=sentence.split(" ");
        int n=s.length;
        if(s[0].charAt(0)!=s[n-1].charAt(s[n-1].length()-1))
        {
            return false;
        }
        for(int i=1;i<n;i++)
        {
            if(s[i].charAt(0) != s[i-1].charAt(s[i-1].length()-1))
            {
                return false;
            }
        }
        return true;
    }
}