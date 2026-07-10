class Solution {
    public String[] sortPeople(String[] names, int[] heights) 
    {
        TreeMap<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
        int n=heights.length;
        for(int i=0;i<n;i++)
        {
            map.put(heights[i],names[i]);
        }
        String r[]=new String[n];
        int i=0;
        for(String values:map.values())
        {
            r[i++]=values;
        }
        return r;
        
    }
}