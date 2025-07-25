// You need to develop an application for cab service providers by implementing the classes based on the class diagram and description given below.

public class AssociationExample {
    public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		
		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		
		//Create more objects of CabServiceProvider and Driver classes for testing your code
	}
}

 class CabServiceProvider{
    //Implement your code here
    private String cabServiceName;
    private int totalCabs;

    public CabServiceProvider(String cabServiceName, int totalCabs){
        this.cabServiceName = cabServiceName;
        this.totalCabs = totalCabs;
    }
    public String getCabServiceName() {
        return cabServiceName;
    }
    public void setCabServiceName(String cabServiceName) {
        this.cabServiceName = cabServiceName;
    }

    public int getTotalCabs() {
        return totalCabs;
    }
    public void setTotalCabs(int totalCabs) {
        this.totalCabs = totalCabs;
    }
    public double calculateRewardPrice(Driver driver) {
        if(this.cabServiceName.equalsIgnoreCase("Halo")){
            if (driver.getAverageRating() >= 4.5f && driver.getAverageRating() <= 5.0f) {
                return 10 * driver.getAverageRating() ;
            } else if (driver.getAverageRating() >= 4.0f && driver.getAverageRating() < 4.5f) {
                return 5 * driver.getAverageRating(); 
            } else {
                return 0; // No bonus for ratings below 4.0
            }
        }else{
            if (driver.getAverageRating() >= 4.5f && driver.getAverageRating() <= 5.0f) {
                return 8 * driver.getAverageRating() ;
            } else if (driver.getAverageRating() >= 4.0f && driver.getAverageRating() < 4.5f) {
                return 3 * driver.getAverageRating(); 
            } else {
                return 0; // No bonus for ratings below 4.0
            }

        }
        
    }
}

 class Driver {
	
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public void setDriverName(String driverName){
		this.driverName=driverName;
	}
	
	public float getAverageRating(){
		return this.averageRating;
	}
	
	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}

