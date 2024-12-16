import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            al.add(a[i]);
        }
        System.out.println(al);
        int left=0;
        int right=(al.size()) - 1;
        while(left<right)
        {
            int temp = al.get(left);
            int temp2=al.get(right);
            al.set(left,temp2);
            al.set(right,temp);
            left++;
            right--;
        }
        System.out.println(al);
    }
}