class Chain
{
   int a,b,c,d;
   Chain(int p,int q)
   {
      a=p;
      b=q;
   }
   Chain(int p,int q,int r)
   {
       this(p,q);// this should be first line
       c=r;
   }
   Chain(int p.int q,int r,int s)
   {
       this(p,q,r);
       d=s;
   }
   
   void display()
   {
       System.out.println(a+" "+b+" "+c+" "+d );
   }
   
   static public void main(String args[])
   {
      Chain obj=new Chain(5,6,8,9);
      obj.display();
   } 
}
