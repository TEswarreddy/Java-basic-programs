// You are using Java
class A 
{
    void display()
    {
        System.out.println("from A");
    }
}
class B extends A
{
    void display2()
    {
        System.out.println("from B");
    }
}
class C extends B
{
    void display3()
    {
        System.out.println("from C");
    }
}
class Main 
{
    public static void main(String args[])
    {
        C c=new C();
        c.display();
        c.display2();
        c.display3();
    }
}
