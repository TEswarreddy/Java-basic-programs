// You are using Java
class ArmstrongNumber
{
    int calculate(int n)
    {
        int digit;
        int result=0;
        while(n>0)
        {
            digit = n%10;
            result +=(digit *digit*digit);
            System.out.println(result);
            n /=10;
        }
        return result;
        
    }
    public void checkArmstrong(int a,int b)
    {
        if(a == b)
        {
            System.out.println("It is a Armstrong Number");
        }
        else
        {
            System.out.println("It is not Armstrong number");
        }
    }
    public static void main(String args[])
    {
        int n=153;
        ArmstrongNumber an=new ArmstrongNumber();
        int result = an.calculate(n);
        an.checkArmstrong(n,result);
    }
}