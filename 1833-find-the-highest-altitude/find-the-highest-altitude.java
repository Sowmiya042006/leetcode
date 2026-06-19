class Solution {
    public int largestAltitude(int[] gain) 
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(gain[0]);
        for(int i=1;i<gain.length;i++)
        {
            list.add(list.get(i)+gain[i]);
        }
        int ans=Collections.max(list);
        return ans;
    }
}