class Test 
{
    public static void main(String args[])
    {
        int arr[]={2,0,2,1,1,0,0};
        int ones =0;
        int zeros =0;
        int twos =0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zeros++;
            }
            else if(arr[i]==1)
            {
                ones++;
            }
            else
            {
                twos++;
            }
        }
        System.out.println("0 - "+zeros);
        System.out.println("1 - "+ones);
        System.out.println("2 - "+twos);
        for(int j=0;j<n;j++)
        {
            if(j<zeros)
            {
               arr[j]=0;
            }
            else if(j>=zeros && j<(ones+zeros))
            {
                arr[j]=1;
            }
            else
            {
                arr[j]=2;
            }
        }
        
        for(int j=0;j<n;j++)
        {
            System.out.println(arr[j]);
        }
    }
}