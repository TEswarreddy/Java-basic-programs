// Find the next 15 leap years from the year passed as parameter to the findLeapYears() method. Include the year passed as parameter if it is a leap year. Implement the logic inside findLeapYears() method and return an int array containing all the leap years.

// Test the functionalities using the main method of the Tester class.

// [Hint: Any year which is divisible by 4 and not by 100 are leap years. Otherwise, any year which is divisible by 400 is also a leap year]
public class Problem2 {
    public static int[] findLeapYears(int year){
       //Implement your code here and change the return value accordingly
       int[] leapYears = new int[15];
       int count = 0;
       while (count < 15) {
           if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
               leapYears[count] = year;
               count++;
           }
           year++;
       }
       return leapYears;
   }
    
   public static void main(String[] args) {
       int year = 2000;
	   int[] leapYears;
	   leapYears=findLeapYears(year);
	   for ( int index = 0; index<leapYears.length; index++ ) {
	       System.out.println(leapYears[index]);
	   }
    }
}
