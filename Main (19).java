
class Test 
{
    public static void main(String args[])
    {
        int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
        int m=a[0].length;
        int n=a.length;
        for(int i=0;i<m;i++)
        {
            
            for(int j=0;j<n;j++)
            {
                System.out.print(a[j][i]);
            }
            System.out.println();
        }
        
        
    }
}