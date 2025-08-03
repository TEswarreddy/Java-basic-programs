public class AbstractExample {
    public static void main(String args[]){
        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
		System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
		System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
		System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
		System.out.println("Total bill amount: " + billAmount);
		
		CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
		System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
		System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
		System.out.println("Total bill amount: " + billAmount);
    }
}


abstract class Payment{
    //Implement your code here
    private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;
    public abstract double payBill(double amount);
    public Payment(int customerId){
        this.customerId=customerId;
    }
    public int getCustomerId(){
        return this.customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }
    public String getPaymentId(){
        return this.paymentId;
    }
    public void setPaymentId(String paymentId){
        this.paymentId=paymentId;
    }
    public double getServiceTaxPercentage(){
        return this.serviceTaxPercentage;
    }   
    public void setServiceTaxPercentage(double serviceTaxPercentage){
        this.serviceTaxPercentage=serviceTaxPercentage;
    }

    
}

class DebitCardPayment extends Payment {
    //Implement your code here
    private static int counter=1000;
    private double discountPercentage;
    
    public DebitCardPayment(int customerId) {
        super(customerId);
        this.setPaymentId("D"+DebitCardPayment.counter++);
        DebitCardPayment.counter++;
    }
    public static int getCounter(){
        return counter;
    }
    public static void setCounter(int counter){
        DebitCardPayment.counter = counter;
    }
    public double getDiscountPercentage() {
        return this.discountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    @Override
    public double payBill(double amount) {
        if(amount<=500){
            this.setServiceTaxPercentage(0.025); // 5% service tax for amounts <= 500
            this.setDiscountPercentage(0.01); // 2% discount for amounts <= 500
        }else if(amount>500 && amount<=1000){
            this.setServiceTaxPercentage(0.04); // 10% service tax for amounts > 500 and <= 1000
            this.setDiscountPercentage(0.002); // 5% discount for amounts > 500 and <= 1000
        }else{
            this.setServiceTaxPercentage(0.05); // 15% service tax for amounts > 1000
            this.setDiscountPercentage(0.003); // 10% discount for amounts > 1000
        }
        double serviceTax = amount * this.getServiceTaxPercentage();
        double discount = amount * this.getDiscountPercentage();
        return amount + serviceTax - discount;
    }

}

class CreditCardPayment extends Payment {
    //Implement your code here
    private static int counter=1000;
    public CreditCardPayment(int customerId) {
        super(customerId);
        this.setPaymentId("C"+CreditCardPayment.counter);
        CreditCardPayment.counter++;
    }
    public static int getCounter(){
        return counter;
    }
    public static void setCounter(int counter){
        CreditCardPayment.counter = counter;
    }
    @Override
    public double payBill(double amount) {
        if(amount<=500){
            this.setServiceTaxPercentage(0.03); // 5% service tax for amounts <= 500
           
        }else if(amount>500 && amount<=1000){
            this.setServiceTaxPercentage(0.05); // 10% service tax for amounts > 500 and <= 1000
            
        }else{
            this.setServiceTaxPercentage(0.06); // 15% service tax for amounts > 1000
        } 
        double serviceTax = amount * this.getServiceTaxPercentage();

        return amount + serviceTax;
    }
}