public class IndianValleyUniversity {
    public static void main(String[] args) {
		
		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
		
		System.out.println("Teacher Details\n***************");
		System.out.println("Name: "+teacher.getName());
		System.out.println("Qualification: "+teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0); 
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: "+officeStaff.getName());
		System.out.println("Designation: "+officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 

        //Create more objects for testing your code   

	}
}
class Faculty{
    //Implement your code here
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;

    public Faculty(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        
    }
    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }
    public void setCarAllowancePercentage(float carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }
    public float getBonusPercentage() {
        return this.bonusPercentage;
    }
    public float getCarAllowancePercentage() {
        return this.carAllowancePercentage;
    }
    public String getName() {
        return this.name;
    }
    public float getBasicSalary() {
        return this.basicSalary;
    }

    public double calculateSalary() {
        double bonus = (this.basicSalary * this.bonusPercentage) / 100;
        double carAllowance = (this.basicSalary * this.carAllowancePercentage) / 100;
        return this.basicSalary + bonus + carAllowance;
    }
}

class OfficeStaff extends Faculty {
    //Implement your code here
    private String designation;

    public OfficeStaff(String name, float basicSalary, String designation) {
        super(name, basicSalary);
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public double calculateSalary() {
        double bonus=(this.getBasicSalary() *this.getBonusPercentage()) / 100;
        double carAllowance=(this.getBasicSalary() *this.getCarAllowancePercentage()) / 100;
        if(this.designation.equalsIgnoreCase("Accountant")) {
            return this.getBasicSalary() + bonus + carAllowance+10000.0;
        }else if(this.designation.equalsIgnoreCase("Clerk")) {
            return this.getBasicSalary() + bonus + carAllowance+7000.0;
        }else if(this.designation.equalsIgnoreCase("Peon")) {
            return this.getBasicSalary() + bonus + carAllowance+4500.0;
        }else{
            return this.getBasicSalary() + bonus + carAllowance;
        }
    }
}

class Teacher extends Faculty {
    //Implement your code here
    private String qualification;

    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public double calculateSalary() {
        double bonus = (this.getBasicSalary() * this.getBonusPercentage()) / 100;
        double carAllowance = (this.getBasicSalary() * this.getCarAllowancePercentage()) / 100;
        if (this.qualification.equalsIgnoreCase("Doctoral")) {
            return this.getBasicSalary() + bonus + carAllowance + 20000.0;
        } else if (this.qualification.equalsIgnoreCase("Masters")) {
            return this.getBasicSalary() + bonus + carAllowance + 18000.0;
        } else if(this.qualification.equalsIgnoreCase("Bachelors")) {
            return this.getBasicSalary() + bonus + carAllowance + 15500.0;
        }else if(this.qualification.equalsIgnoreCase("Associates")) {
            return this.getBasicSalary() + bonus + carAllowance + 10000.0;
        } else{
            return this.getBasicSalary() + bonus + carAllowance;
        }
    }

}