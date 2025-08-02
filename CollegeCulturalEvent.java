public class CollegeCulturalEvent {
   public static void main(String[] args) {
            
        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
		soloEvent.registerEvent();
		if (soloEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + soloEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
			System.out.println("Your participant number is " + soloEvent.getParticipantNo());

		} else {
			System.out.println("Please enter a valid event");
		}

		System.out.println();
		TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
		teamEvent.registerEvent();
		if (teamEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + teamEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
			System.out.println("Your team number is " + teamEvent.getTeamNo());
		} else {
			System.out.println("Please enter a valid event");
		}
	}
}

class Event{
    //Implement your code here
    private String eventName;
    private String participantName;
    private double registrationFee;

    public Event(String eventName, String participantName) {
        this.eventName = eventName;
        this.participantName = participantName;
    }
    public String getEventName() {
        return this.eventName;
    }
    public String getParticipantName() {
        return this.participantName;
    }
    public double getRegistrationFee() {
        return this.registrationFee;
    }
    public void setEventName(String eventName){
        this.eventName=eventName;
    }
    public void setParticipantName(String participantName){
        this.participantName = participantName;
    }
    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public void registerEvent() {
        if(this.eventName.equalsIgnoreCase("Singing")) {
            this.registrationFee = 8;
        } else if(this.eventName.equalsIgnoreCase("Dancing")){
            this.registrationFee = 10;
        }else if(this.eventName.equalsIgnoreCase("Acting")){
            this.registrationFee = 15;
        }else if(this.eventName.equalsIgnoreCase("DigitalArt")){
            this.registrationFee = 12;
        }else{
            this.registrationFee = 0; // Invalid event
        }
    }

}

class SoloEvent extends Event {
    //Implement your code here
    private int participantNo;

    public SoloEvent(String eventName, String participantName, int participantNo) {
        super(eventName, participantName);
        this.participantNo = participantNo;
    }
    public int getParticipantNo() {
        return this.participantNo;
    }
    public void setParticipantNo(int participantNo) {
        this.participantNo=participantNo;
    }

    @Override
    public void registerEvent() {
        if(this.getEventName().equalsIgnoreCase("Singing")) {
            this.setRegistrationFee(4);
        } else if(this.getEventName().equalsIgnoreCase("Dancing")){
            this.setRegistrationFee(6);
        }else if(this.getEventName().equalsIgnoreCase("Acting")){
            this.setRegistrationFee(10);
        }else if(this.getEventName().equalsIgnoreCase("DigitalArt")){
            this.setRegistrationFee(8);
        }else{
            this.setRegistrationFee(0); // Invalid event
        }
    }
}

class TeamEvent extends Event{
    //Implement your code here
    private int noOfParticipants;
    private int teamNo;

    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
        super(eventName, participantName);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }
    public int getNoOfParticipants() {
       return this.noOfParticipants;
    }
    public int getTeamNo() {
        return this.teamNo;
    }
    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants=noOfParticipants;
    }
    public void setTeamNo(int teamNo) {
        this.teamNo=teamNo;
    }
    @Override
    public void registerEvent(){
        if(this.getEventName().equalsIgnoreCase("Singing")) {
            this.setRegistrationFee(4*noOfParticipants);
        } else if(this.getEventName().equalsIgnoreCase("Dancing")){
            this.setRegistrationFee(6*noOfParticipants);
        }else if(this.getEventName().equalsIgnoreCase("Acting")){
            this.setRegistrationFee(10*noOfParticipants);
        }else if(this.getEventName().equalsIgnoreCase("DigitalArt")){
            this.setRegistrationFee(8*noOfParticipants);
        }else{
            this.setRegistrationFee(0); // Invalid event
        }
    }
}