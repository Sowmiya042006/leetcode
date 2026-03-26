class Solution {
    public List<String>r=new ArrayList<>();
    public List<String> generateParenthesis(int n) 
    {
        gen(0,0,"",n);
        return r;
    }
    public void gen(int op,int cl,String s,int n)
    {
        if(s.length()==2*n)
        {
            r.add(s);
            return;
        }
        if(op<n)
        {
            gen(op+1,cl,s+'(',n);
        }
        if(cl<op)
        {
            gen(op,cl+1,s+')',n);
        }
    }
    
}