class Main 
{
    static void display(int n)
    {
        int a[]=new int[n];
           a[0]=1;
           a[1]=2;
           a[2]=3;
           a[3]=4;
           a[4]=5;
           a[5]=6;
           for(int i=0;i<n;i++)
           {
             System.out.println(a[i]);  
           }
    }
    public static void main(String args[])
    {
        
       try{
           int n=5;
           display(5);
           
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
            int n=6;
            display(n);
    
       }
        
    }
}