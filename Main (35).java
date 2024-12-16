// You are using Java
class Parent
{
    void parentcar()
    {
        System.out.println("Parent having car");
    }
    void parenthouse()
    {
        System.out.println("Parent having house");
    }
}
class Child extends Parent
{
    void childbike()
    {
        System.out.println("child having bike");
    }
}
class Main 
{
    public static void main(String args[])
    {
        Child c=new Child();
        c.parenthouse();
        c.parentcar();
        c.childbike();
    }
}