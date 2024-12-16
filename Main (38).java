// You are using Java
class A 
{
    A()
    {
        System.out.println("Class A constructor invoked");
    }
    void display()
    {
        System.out.println("from A");
    }
}
class B extends A
{
     B()
    {
        System.out.println("Class B constructor invoked");
    }
    void display2()
    {
        System.out.println("from B");
    }
}
class C extends B
{
     C()
    {
        System.out.println("Class C constructor invoked");
    }
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
