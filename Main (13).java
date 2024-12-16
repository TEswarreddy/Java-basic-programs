class Test 
{
    public static void main(String args[])
    {
        int a[]={2,3,4,5,1};
        int n= a.length;
        int large=0;
        int sec_larg =0;
        for(int i=0;i<n;i++)
        {
            if(a[i]> large)
            {
                large=a[i];
            }
            
        }
        System.out.println(large);
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==large){
                continue;
            }
            if(a[i]> sec_larg)
            {
                sec_larg=a[i];
            }
            
        }
        System.out.println(sec_larg);
    }
}