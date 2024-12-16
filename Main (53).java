import java.util.*;
class Main 
{
    public static void main(String args[])
    {
       int a[]={1,2,3,4,2,1};
       HashMap<Integer,Integer> map =new HashMap<>();
       int size=a.length;
       int target=9;
       for(int i=0;i<size;i++)
       {
           for(int j=0;j<size;j++)
           {
               if(i==j)
               {
                   continue;
               }
               int x=target-a[i]-a[j];
               if(map.containsKey(x) && j!=map.get(x) && i!=map.get(x))
               {
                   System.out.println("Indexes "+i+" "+j+" "+map.get(x));
                   break;
               }
           }
           map.put(a[i],i);
       }
    }
}