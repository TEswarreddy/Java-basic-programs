public class PriceOfItems {
    public static void main(String[] args) {
		
		Bill bill = new Bill();
		
		double price = bill.findPrice(1001);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The Item Id is invalid");
		
		price = bill.findPrice("Reebok","T-shirt",34);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The values are not valid");
	}
}
class Bill{
    //Implement your code here
    public double findPrice(int itemId) {
        // Assuming a simple mapping of itemId to price
        if (itemId == 1001) {
            return 25; // Example price for itemId 1001
        }else if (itemId == 1002) {
            return 20; // Example price for itemId 1002
        } else if (itemId == 1003) {
            return 18; // Example price for itemId 1003
        }
        return 0; // Invalid itemId
    }

    public double findPrice(String brandName, String itemType, int size) {
        // Assuming a simple mapping of item details to price
        if (brandName.equals("Puma") && itemType.equals("T-shirt") && (size == 34 || size == 36)) {
            return 25; // Example price for the specific item
        }else if(brandName.equals("Puma") && itemType.equals("Skirt") && (size == 38 || size == 40)) {
            return 20; // Example price for Puma Skirt size 38 or 40
        }else if (brandName.equals("Reebok") && itemType.equals("T-shirt") && (size == 34 || size == 36)) {
            return 23; // Example price for the specific item
        }else if(brandName.equals("Reebok") && itemType.equals("Skirt") && (size == 38 || size == 40)) {
            return 18; // Example price for Puma Skirt size 38 or 40
        }
        return 0; // Invalid item details
    }
}