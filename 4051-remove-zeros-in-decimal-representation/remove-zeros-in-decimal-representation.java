class Solution {
    public long removeZeros(long n) 
    {
        String s=Long.toString(n);
        String r=s.replace("0","");
        long result=Long.parseLong(r);
        return result;
    }
}