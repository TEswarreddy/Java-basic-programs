// A dance club is conducting auditions to admit interested candidates. You need to implement a Participant class for the dance club based on the class diagram and description given below.


public class DanceClub {
    public static void main(String[] args) {
		
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		
		//Create more objects and add them to the participants array for testing your code
		
		Participant[] participants = { participant1, participant2 };
		
		for (Participant participant : participants) {
			System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}

	}
}




class Participant {
    //Implement your code here
    private static int counter;
    private String registrationId;
    private String name;
    private long contactNumber;
    private String city;

    public Participant(String name, long contactNumber, String city) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.city = city;
        counter++;
        this.registrationId = "D"+(10000+counter);
       
    }

    public String getRegistrationId(){
        return this.registrationId;
    }
    public static int getCounter()
    {
        return counter;
    }
    public static void setCounter(int counter) {
        Participant.counter = counter;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getContactNumber() {
        return this.contactNumber;
    }
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }

}


