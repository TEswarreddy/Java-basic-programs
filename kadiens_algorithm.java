//kadiens algorithm
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int a[]={-1,-1,1,-3,4,-1,2,1,-5};
        int n=a.length;
        int max_sum=-10000;
        int i=0;
        int currentsum =0;
        int end_pos=0,start_pos=0;
        while(i<n)
        {
           currentsum+=a[i];
           if(currentsum>max_sum)
           {
               max_sum=currentsum;
               end_pos=i;
           }
           if(currentsum<0)
           {
               currentsum=0;
               start_pos=i;
           }
           i++;
        }
        System.out.println(max_sum);
        System.out.println("Starting position of subarray:"+start_pos);
        System.out.println("Ending position subarray:"+end_pos);
    }
}
/*
Output:
6
Starting position of subarray:3
Ending position subarray:7
*/
