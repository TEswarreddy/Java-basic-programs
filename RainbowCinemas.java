// Rainbow Cinemas is an upcoming multiplex in the city with a seating capacity of 400 people. They need an application to be developed for booking of tickets.
public class RainbowCinemas {
    public static void main(String[] args) {
        Booking booking1 = new Booking("jack@email.com", 100);
        Booking booking2 = new Booking("jill@email.com", 350);

        //Create more objects and add them to the bookings array for testing your code
        
        Booking[] bookings = { booking1, booking2 };
              
        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(booking.getSeatsRequired()+" seats successfully booked for "+booking.getCustomerEmail());
            }
            else {
                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
                System.out.println("Seats available: "+Booking.getSeatsAvailable());
            }
         }
    }
}

class Booking{
    //Implement your code here
    private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable ;

    static {
        seatsAvailable = 400; // Initializing the total seats available
    }

    public Booking(String customerEmail, int seatsRequired) {
        this.customerEmail = customerEmail;
        this.seatsRequired = seatsRequired;
        if (seatsAvailable >= this.seatsRequired) {
            isBooked = true;
            seatsAvailable -= this.seatsRequired;
        } else {
            isBooked = false;
        }
    }
    public String getCustomerEmail() {
        return this.customerEmail;
    }
    public int getSeatsRequired() {
        return this.seatsRequired;
    }
    public boolean isBooked() {
        return this.isBooked;
    }
    public static int getSeatsAvailable() {
        return seatsAvailable;
    }
    public static void setSeatsAvailable(int seatsAvailable) {
        Booking.seatsAvailable = seatsAvailable;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public void setSeatsRequired(int seatsRequired) {
        this.seatsRequired = seatsRequired;
    }
    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }
    
}