
class Test 
{
    public static void main(String args[])
    {
        int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
        int m=a[0].length;
        int n=a.length;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                    sum1 +=a[i][j]; 
                }
                // if((i==0 && j==2) || (i==1&& j==1) || (i==2 && j==0))
                // {
                //     sum2 +=a[i][j]; 
                // }
            }
            
        }
        //System.out.println(sum1);
        //System.out.println(sum2);
        int j=n-1;
        for(int i=0;i<n;i++)
        {
            sum2 +=a[i][j];
            j--;
        }
        int diagonal = sum1+sum2;
        System.out.println(diagonal);
    }
}