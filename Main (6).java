// You are using Java
class Human{
    static int count=0;
    int age;
    int height;
    int weight;
    Human(){
       count ++;
    }
}
class Test 
{
   public static void main(String args[])
   {
       Human h1=new Human();
       System.out.println(h1.count);
       Human h2=new Human();
       System.out.println(h2.count);
       Human h3=new Human();
       System.out.println(h3.count);
       Human h4=new Human();
       System.out.println(h4.count);
       Human h5=new Human();
       System.out.println(h5.count);
   }
}
