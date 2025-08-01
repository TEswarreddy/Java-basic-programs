public class AnchorCollege {
  public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
    }  
}

abstract class Student{
    //Implement your code here
    private String studentName;
    private int[] testScores = new int[4];
    private String testResult;

    public Student(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getTestScore(int index) {
        return this.testScores[index];
    }
    public int[] getTestScores() {
        return this.testScores;
    }
    public void setTestScore(int testNumber, int testScore) {
        if (testNumber >= 0 && testNumber < testScores.length) {
            this.testScores[testNumber] = testScore;
        } else {
            System.out.println("Invalid index for test scores.");
        }
    }
    public String getTestResult() {
        return testResult;
    }
    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public abstract void generateResult();
}

class UndergraduateStudent extends Student{
    public UndergraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int total = 0;
        for (int i = 0; i < 4; i++) {
            total += this.getTestScore(i);
        }
        double average = total / 4.0;
        if (average >= 60) {
            this.setTestResult("Pass");
        } else {
            this.setTestResult("Fail");
        }
    }
}

class GraduateStudent extends Student{
    public GraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int total = 0;
        for (int i = 0; i < 4; i++) {
            total += this.getTestScore(i);
        }
        double average = total / 4.0;
        if (average >= 70) {
            this.setTestResult("Pass");
        } else {
            this.setTestResult("Fail");
        }
    }
}
