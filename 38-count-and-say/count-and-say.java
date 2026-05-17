class Solution {
    public static String s="1";
    public String operation(String s)
    {
        String a="";
        char ch=s.charAt(0);
        int c=1;
        for(int i=1;i<s.length();i++)
        {
           if(ch==s.charAt(i))
           {
            c++;
           }
           else
           {
            a=a+Integer.toString(c)+ch;
            c=1;
            ch=s.charAt(i);
           }
        }
        a=a+Integer.toString(c)+ch;
        s=a;
        return s;
    }
    public String countAndSay(int n) 
    {
        if(n==1)
        {
            return s;
        }
        String prev = countAndSay(n - 1);

        return operation(prev);
    }
}