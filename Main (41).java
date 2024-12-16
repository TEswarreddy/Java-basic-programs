class Student
{
    String name;
    int rollno;
    Student(String name)
    {
        this.name=name;
    }
    Student(String name,int rollno)
    {
        this.name = name;
        this.rollno=rollno;
    }
    void printDetails()
    {
        System.out.println(this.name+" rollnumber is "+this.rollno);
    }
}
class Main
{
    public static void main(String args[])
    {
        Student soumya = new Student("Eswar");
        soumya.printDetails();
        Student rahul=new Student("rahul",333333);
        rahul.printDetails();
    }
}