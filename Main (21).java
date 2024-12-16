// You are using Java

class Test 
{
    public static void main(String args[])
    {
        int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
        int m=a[0].length;
        int n=a.length;
        int sum;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=0;j<m;j++)
            {
                sum +=a[i][j];
            }
            System.out.println(sum);
        }
      
    }
}