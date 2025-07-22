import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesandSpaces {
    public static String removeDuplicatesandSpaces(String str){
        //Implement your code here and change the return value accordingly
        Set<Character> charSet = new HashSet<Character>();
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ' ' && !charSet.contains(c)) {
                charSet.add(c);
                result.append(c);
            }
        }
        return result.toString();
	}
	
	public static void main(String args[]){
	    String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpaces(str));
	}
}
