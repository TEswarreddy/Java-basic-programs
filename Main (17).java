class Test 
{
  public static void main(String args[])
  {
      int []a={1,2,2,3,4,4,4,5,5};
      int n=a.length;
      
      
      int k=1;
          for(int i=0;i<n-1;i++)
          {
              if(a[i]!=a[i+1])
              {
                  a[k]=a[i+1];
                  k++;
              }
              
              
          }
      
      
      for(int i=0;i<k;i++)
      {
          System.out.println(a[i]);
      }
  }
}
