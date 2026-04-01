class Solution {
    public int[] recoverOrder(int[] order, int[] friends) 
    {
        int[] r=new int[friends.length];
        int k=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<friends.length;i++)
        {
            list.add(friends[i]);
        }
        for(int i=0;i<order.length;i++)
        {
            if(list.contains(order[i]))
            {
                r[k++]=order[i];
            }
        }
        return r;

    }
}