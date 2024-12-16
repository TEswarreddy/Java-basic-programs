// You are using Java

class Test 
{
    public static void main(String args[])
    {
        int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
        int m=a[0].length;
        int n=a.length;
        int sum;
        System.out.println("Upper Triangular Matrix");
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                if((i!=j)&&  (j>0) &&(j>i))
                {
                    System.out.println(a[i][j]);
                }
            }
            
        }
        System.out.println("Lower Triangular Matrix");
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                if((i!=j)&&  (i>0) &&(j<i) )
                {
                    System.out.println(a[i][j]);
                }
            }
            
        }
      
    }
}