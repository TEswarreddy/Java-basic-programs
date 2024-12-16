// You are using Java
class Demo
{
    public static void main(String args[])
    {
        int n=143;
        int temp=n;
        int digit,fact,fact_sum=0;
        while(n>0)
        {
            digit = n%10;
            fact =1;
            for(int i=digit;i>=1;i--)
            {
                fact *=i;
            }
            System.out.println(fact);
            fact_sum +=fact;
            n /=10;
        }
        if(temp == fact_sum)
        {
            System.out.println("It is a Strong Number");
        }
        else
        {
            System.out.println("It is not Strong number");
        }
    }
}