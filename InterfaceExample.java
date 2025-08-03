public class InterfaceExample {
    public static void main(String args[]){
		SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
		if(smartPhone.testCompatibility())
		    System.out.println("The mobile OS is compatible with the network generation!");
		else
		    System.out.println("The mobile OS is not compatible with the network generation!");
		
		//Create more objects for testing your code
	}
}

interface Testable{
    //Implement your code here
    boolean testCompatibility(); 
}

class Mobile {
    //Implement your code here
    private String name;
    private String brand;
    private String operatingSystemName;
    private String operatingSystemVersion;

    public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
        this.name = name;
        this.brand = brand;
        this.operatingSystemName = operatingSystemName;
        this.operatingSystemVersion = operatingSystemVersion;
    }
    public String getName() {
        return this.name;
    }
    public String getBrand() {
        return this.brand;
    }
    public String getOperatingSystemName() {
        return this.operatingSystemName;
    }
    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }   
    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }
    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }
}

class SmartPhone extends Mobile implements Testable {
    private String networkGeneration;

    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }

    @Override
    public boolean testCompatibility() {
        // Implement your compatibility testing logic here
        if (this.getOperatingSystemName().equalsIgnoreCase("Saturn") ) {
            if(this.networkGeneration.equalsIgnoreCase("3G") &&(this.getOperatingSystemVersion().equals("1.3") || this.getOperatingSystemVersion().equals("1.2") || this.getOperatingSystemVersion().equals("1.1"))) {
                return true;
            }else if(this.networkGeneration.equalsIgnoreCase("4G") && (this.getOperatingSystemVersion().equals("1.2") || this.getOperatingSystemVersion().equals("1.3"))) {
                return true;
            }else if(this.networkGeneration.equalsIgnoreCase("5G") && (this.getOperatingSystemVersion().equals("1.3"))) {
                return true;
            }else{
                return false;
            }
        }else if(this.getOperatingSystemName().equalsIgnoreCase("Gara")) {
            if(this.networkGeneration.equalsIgnoreCase("3G") && (this.getOperatingSystemVersion().equals("EXRT.1") || this.getOperatingSystemVersion().equals("EXRT.2") || this.getOperatingSystemVersion().equals("EXRU.1"))) {
                return true;
            }else if(this.networkGeneration.equalsIgnoreCase("4G") && (this.getOperatingSystemVersion().equals("EXRT.2") || this.getOperatingSystemVersion().equals("EXRU.1"))) {
                return true;
            }else if(this.networkGeneration.equalsIgnoreCase("5G") && (this.getOperatingSystemVersion().equals("EXRU.1"))) {
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }

    }
    public String getNetworkGeneration() {
        return this.networkGeneration;
    }
    public void setNetworkGeneration(String networkGeneration) {
        this.networkGeneration = networkGeneration;
    }
}