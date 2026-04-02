class Solution {
    public int maxContainers(int n, int w, int maxWeight) 
    {
        int x=maxWeight/w;
        int num=n*n;
        if(x>num)
        {
            return num;
        }
       return x;
    }
}