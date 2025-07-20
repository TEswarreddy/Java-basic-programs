
class Main {
    public static String moveSpecialCharacters(String str){
	    StringBuilder sol = new StringBuilder();
        StringBuilder special = new StringBuilder();
	    for(char c: str.toCharArray()){
	         if (!Character.isLetterOrDigit(c)){
	             special.append(c);
	         }
	         else{
	             sol.append(c);
	         }
	    }
	    sol.append(special);
        return sol.toString();
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
}
