// You are using Java

class Test 
{
    public static void main(String args[])
    {
        int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
        int m=a[0].length;
        int n=a.length;
        int temp;
        
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                
                if(j>i)
                {
                temp =a[i][j];
                // System.out.println(a[i][j]);
                // System.out.println(a[j][i]);
                a[i][j]=a[j][i];
                a[j][i]=temp;
                }
                
                
            }
            
        }
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
       
      
    }
}