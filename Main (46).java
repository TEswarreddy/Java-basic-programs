import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int a[]={9,4,7,5,9};
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            al.add(a[i]);
        }
        System.out.println(al);
    }
}