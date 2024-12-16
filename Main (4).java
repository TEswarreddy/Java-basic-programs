// You are using Java

class StrongNumber
{
    public int factoril(int x)
    {
        int fact =1;
        for(int i=1;i<=x;i++)
        {
            fact *=i;
        }
        System.out.println(fact);
        return fact;
    }
    public void checkStrong(int a,int b)
    {
        if(a == b)
        {
            System.out.println("It is a Strong Number");
        }
        else
        {
            System.out.println("It is not Strong number");
        }
    }
    public static void main(String args[])
    {
        int n=145;
        int temp=n;
        int digit,fact_sum=0;
        StrongNumber sn=new StrongNumber();
        while(n>0)
        {
            digit = n%10;
           
            fact_sum += sn.factoril(digit);
            n /=10;
        }
        sn.checkStrong(temp,fact_sum);
        
    }
}