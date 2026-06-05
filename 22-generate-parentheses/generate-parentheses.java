class Solution {
    public List<String>list=new ArrayList<>();
    public List<String> generateParenthesis(int n) 
    {
        gen(0,0,"",n);
        return list;
        
    }
    public void gen(int op,int cl,String r,int n)
    {
        if(r.length()==2*n)
        {
            list.add(r);
            return;
        }
        if(op<n)
        {
            gen(op+1,cl,r+"(",n);
        }
        if(cl<op)
        {
            gen(op,cl+1,r+")",n);
        }
    }
}