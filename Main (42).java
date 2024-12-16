// You are using Java
interface Animal
{
    public void legs();
    public void weights();
}
class Eagle implements Animal
{
    public void legs()
    {
        System.out.println("Eagle has 2 legs");
        
    }
    public void weights()
    {
        System.out.println("Eagle weight is 4 kg");
    }
}
class Dog implements Animal
{
    public void legs()
    {
        System.out.println("Dog has 4 legs");
        
    }
    public void weights()
    {
        System.out.println("Dog weight is 25 kg");
    }
}
class Fish implements Animal
{
    public void legs()
    {
        System.out.println("Fish has no legs");
        
    }
    public void weights()
    {
        System.out.println("Fish weight is 2 kg");
    }
}
class Main  
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.legs();
        d.weights();
        Fish f=new Fish();
        f.legs();
        f.weights();
        Eagle e=new Eagle();
        e.legs();
        e.weights();
    }
}