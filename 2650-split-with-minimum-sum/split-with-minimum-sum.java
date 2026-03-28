class Solution {
    public int splitNum(int num) 
    {
        ArrayList<Integer>list=new ArrayList<>();
        int temp=num;
        while(num!=0)
        {
            int t=num%10;
            list.add(t);
            num=num/10;
        }
        Collections.sort(list);
        int n1=0;
        int n2=0;
        for(int i=0;i<list.size();i++)
        {
          if(i%2==0)
          {
            n1=(n1*10)+list.get(i);
          }
          else
          {
            n2=(n2*10)+list.get(i);
          }
        }
        return n1+n2;
    }
}