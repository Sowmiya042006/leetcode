import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones)
        {
            p.offer(i);
        }
        while(p.size()>1)
        {
            int y=p.poll();
            int x=p.poll();
            if(y!=x)
            {
                p.offer(y-x);
            }
        }
        return p.isEmpty()?0:p.peek();
    }
}