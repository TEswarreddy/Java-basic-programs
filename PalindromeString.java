class PalindromeString {
    public static boolean checkPalindrome(String str){
	    //Implement your code here and change the return value accordingly
        int left = 0;
        int right = str.length() - 1;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
            if(left >= right) {
                return true;
            }
        }
        return false;
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}