// Find and return the count of the adjacent occurrence of a number in the numbers array passed to the findTotalCount() method. Implement the logic inside findTotalCount() method.
public class Problem5 {
    public static int findTotalCount(int[] numbers) {
		//Implement your code here and change the return value accordingly
        if (numbers == null || numbers.length == 0) {
            return 0; // Return 0 if the array is empty or null
        }
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                count++;
            }
        }
        return count;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 5, 100, -20, 6, 0, 0 };
		System.out.println("Count of adjacent occurrence: "+findTotalCount(numbers));
	}
}
