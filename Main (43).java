class Main 
{
    public static void main(String args[])
    {
        try{
            int res=100/0;
        }catch(ArithmeticException e)
        {
            System.out.println("it is an Divide by zero Error");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("It runs whether Exception is occured or not");
        }
        
    }
}