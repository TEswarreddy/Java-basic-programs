// Jumbo Bus Service provides bus services from New York to various cities based on different kinds of packages. They want to ensure that appropriate messages are displayed for users while booking buses. You need to help the Jumbo Bus Service by developing an application based on the class diagram and description given below.
public class BusServices {
    public static void main(String[] args) {
		BusBooking booking = new BusBooking(101,"Orlando", "Regular");
		String result = booking.bookTrip("BIGBUS", 11);
		if(result.equals("Booking successful")){
			System.out.println(result);
			System.out.println("Total amount for the trip: " + booking.getTotalAmount());
		}
		else{
			System.out.println(result);
			System.out.println("Your booking was not successful, please try again!");
		}
	}
}

class InvalidCouponCodeException extends Exception{
    InvalidCouponCodeException(String message){
        super(message);
    }
}

class InvalidDestinationException extends Exception{
    InvalidDestinationException(String message){
        super(message);
    }
}

class InvalidTripPackageException extends Exception{
    InvalidTripPackageException(String message){
        super(message);
    }
}
class BusBooking{
    //Implement your code here
    private int bookingId;
    private String destination;
    private String tripPackage;
    private double totalAmount;

    public BusBooking(int bookingId, String destination, String tripPackage) {
        this.bookingId = bookingId;
        this.destination = destination;
        this.tripPackage = tripPackage;
    }
    public double getTotalAmount() {
        return this.totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getBookingId() {
        return this.bookingId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public String getDestination() {
        return this.destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getTripPackage() {
        return this.tripPackage;
    }
    public void setTripPackage(String tripPackage) {
        this.tripPackage = tripPackage;
    }

    public String bookTrip(String couponCode,int numberOfMembers)  {
        try {
            if(validateDestination(this.destination) && validateTripPackage(this.tripPackage)) {
                if(validateCouponCode(couponCode,numberOfMembers)) {
                    if(this.tripPackage.equalsIgnoreCase("Regular")) {
                        this.totalAmount = 500 * numberOfMembers;
                    }else  {
                        this.totalAmount = 800 * numberOfMembers;
                    }
                    return "Booking successful";
                }else{
                    return "Your booking was not successful, please try again!";
                }
            }else{
                return "Your booking was not successful, please try again!";
            }
        }catch(InvalidCouponCodeException | InvalidDestinationException | InvalidTripPackageException e) {
            return e.getMessage();
        }
        
    }

    public boolean validateCouponCode(String couponCode, int numberOfMembers) throws InvalidCouponCodeException {
        if((couponCode.equals("BIGBUS") && numberOfMembers >= 10) || (couponCode.equals("MAGICBUS") && numberOfMembers >=15)) {
            return true;
        }
        else{
            throw new InvalidCouponCodeException("Invalid coupon code");
        }
    }
    public boolean validateDestination(String destination) throws InvalidDestinationException {
        if(this.destination.equals("Washington DC") || this.destination.equals("Philadelphia") || this.destination.equals("Orlando") || this.destination.equals("Boston") || this.destination.equals("Atlanta")) {
            return true;
        }else{
            throw new InvalidDestinationException("Invalid destination");
        }
    }
    public boolean validateTripPackage(String tripPackage) throws InvalidTripPackageException {
        if(this.tripPackage.equalsIgnoreCase("Regular") || this.tripPackage.equalsIgnoreCase("Premium")) {
            return true;
        }else{
            throw new InvalidTripPackageException("Invalid package");
        }
    }
}