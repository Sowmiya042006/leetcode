class Solution {
    public boolean isPalindrome(String s) 
    {
        String str="";
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
            {
                char ch=Character.toLowerCase(s.charAt(i));
                str=str+ch;
                rev=ch+rev;
            }
        }
        if(rev.equals(str))
        {
            return true;
        }
        return false;
    }
}