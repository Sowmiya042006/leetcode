class Solution {
    public static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) 
    {
        int vow=0;
        int max=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(isVowel(ch))
            {
                vow++;
            }
            if(right>=k)
            {
                if(isVowel(s.charAt(right-k)))
                {
                    vow--;
                }
            }
             max=Math.max(max,vow);
        }
        return max;
    }
    
}