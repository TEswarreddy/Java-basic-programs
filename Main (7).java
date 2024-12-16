// You are using Java

class Animal{
    String breed;
}
class Human{
    String name;
    Animal pet;
    
    Human(String name,String n){
      this.pet = new Animal();
      this.pet.breed = n;
      this.name = name;
    }
    void printName()
    {
        System.out.println(this.name);
        System.out.println(this.pet.breed);
    }
    
}
class Test 
{
   public static void main(String args[])
   {
       Human h1=new Human("Eswar","Dog");
       h1.printName();
       
   }
}
