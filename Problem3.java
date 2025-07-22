//The results of a mid-term assessment have been declared. The marks scored by a student in different subjects are stored in an array.

//You need to find the corresponding grade for each subject by implementing the class Student based on the class diagram and description given below.

public class Problem3 {
    	public static void main(String[] args) {
		int[] marks = { 79, 87, 97, 65, 78, 99, 66 }; 
		Student student = new Student(marks);
		student.findGrade();
        System.out.println("Grades corresponding to the marks are : ");
		char[] grades = student.getGrade();
		for (int index = 0; index < grades.length; index++) {
			System.out.print(grades[index] + " ");
		}
	}
}
class Student{
    //Implement your code here
    private int[] marks;
    private char[] grade;
    public Student(int[] marks){
        this.marks=marks;
        this.grade=new char[marks.length];
    }
    public void findGrade(){
        for(int index=0;index<marks.length;index++){
            if(marks[index]>=92){
                grade[index]='E';
            }else if(marks[index]>=85 && marks[index]<92){
                grade[index]='A';
            }else if(marks[index]>=70 && marks[index]<85){
                grade[index]='B';
            }else if(marks[index]>=65 && marks[index]<70){
                grade[index]='C';
            }else{
                grade[index]='D';
            }
        }
    }
    public char[] getGrade(){
        return this.grade;
    }
    public int[] getMarks(){
        return this.marks;
    }
    public void setMarks(int[] marks){
        this.marks=marks;
    }
    public void setGrade(char[] grade){
        this.grade=grade;
    }
}

