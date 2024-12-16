import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int a[]={3,2,7,3,1,7,8,0};
        HashSet<Integer> h=new HashSet<>();
        int d=0;
        for(int i=0;i<a.length;i++)
        {
            if(h.contains(a[i]))
            {
                d=a[i];
            }
            h.add(a[i]);
        }
        System.out.println(d);
        System.out.println(h);
     
    }
}