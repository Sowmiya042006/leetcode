class Solution {
     public static int getValue(char c)
        {
         switch(c)
         {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            
         }
        return -1;
        }
    public int romanToInt(String s) 
    {
        int sum=0;
        char[] ch=s.toCharArray();
        int prev=0;
        for(int i=ch.length-1;i>=0;i--)
        {
            int v=getValue(ch[i]);
            if(v>=prev)
            {
                sum=sum+v;
                prev=v;
            }
            else if(v<prev)
            {
                sum=sum-v;
                prev=v;
            }
        }
       return sum;
    }
}