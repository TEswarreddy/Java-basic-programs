// Implement the method findNumbers accepting two numbers num1 and num2 based on the conditions given below:

// Validate that num1 should be less than num2

// If the validations are successful

// populate all the 2 digit positive numbers between num1 and num2 into the provided numbers array if

// sum of the digits of the number is a multiple of 3

// number is a multiple of 5

// Return the numbers array
public class Problem4 {
    public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];

		// Implement your code here
        if (num1 >= num2) {
            numbers[0] = 0; // Indicating no valid numbers found
            return numbers;
        }
        int count=0;
        for(int i=num1;i<=num2;i++) {
            if(i >= 10 && i < 100) { // Check if it's a two-digit number
                int sumOfDigits = (i / 10) + (i % 10); // Calculate sum of digits
                if(sumOfDigits % 3 == 0 && i % 5 == 0) { // Check conditions
                    numbers[count++] = i; // Store the valid number
                    if(count == numbers.length) {
                        break; // Stop if the array is full
                    }
                }
            }
        }
		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}
