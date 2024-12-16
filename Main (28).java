import java.util.*;
class Example
{
    public static void main(String args[])
    {
       String name ="Eswar";
       int n=name.length();
       for(int i=n-1;i>=0;i--)
       {
           char x = name.charAt(i);
           System.out.print(x);
       }
       System.out.println(name.reverse());
    }
    
}