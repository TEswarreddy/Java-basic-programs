import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int a[]={3,4,5,7,2,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        int target=6;
        for(int i=0;i<a.length;i++)
        {
            int x=target-a[i];
            if(map.containsKey(x))
            {
                System.out.println("index "+map.get(x)+" "+i);
            }
            map.put(a[i],i);
        }
      
     
    }
}