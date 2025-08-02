public class PayingTax {
    public static void main(String args[]) {
		System.out.println("Purchase Details\n***************");
		PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Canada");
		System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+seller.getTaxPercentage());
		
		//Create more objects for testing your code
	}
}

interface Tax{
    //Implement your code here
    double calculateTax(double amount);
}

class PurchaseDetails implements Tax {
    //Implement your code here
    private String purchaseId;
    private String paymentType;
    private double taxPercentage;

    public PurchaseDetails(String purchaseId, String paymentType) {
        this.purchaseId = purchaseId;
        this.paymentType = paymentType;
        
    }

    @Override
    public double calculateTax(double price) {
        // Implement your tax calculation logic here
        if(this.paymentType.equalsIgnoreCase("Credit Card")){
            this.taxPercentage = 3.0; // Example tax percentage for credit card payments
        } else if(this.paymentType.equalsIgnoreCase("Debit Card")){
            this.taxPercentage = 2.0; // Example tax percentage for debit card payments
        } else {
            this.taxPercentage = 4.0; // Default tax percentage
        }
        return price * taxPercentage / 100;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }
    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    
    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

}

class Seller implements Tax {
    // Implement your code here
    private String location;
    private double taxPercentage;

    public Seller(String location) {
        this.location = location;
    }

    @Override
    public double calculateTax(double price) {
        // Implement your tax calculation logic here
        if(this.location.equalsIgnoreCase("Canada")){
            this.taxPercentage = 22.0; // Example tax percentage for Canada
        } else if(this.location.equalsIgnoreCase("Middle east")){
            this.taxPercentage = 15.0; // Example tax percentage for Middle east
        } else if(this.location.equalsIgnoreCase("Europe")){
            this.taxPercentage = 25.0; // Example tax percentage for Europe
        } else if(this.location.equalsIgnoreCase("Japan")){
            this.taxPercentage = 12.0; // Example tax percentage for Japan
        } else {
            this.taxPercentage = 0.0; // Default tax percentage
        }
        return price * taxPercentage / 100;
    }

    public String getLocation() {
        return location;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
}