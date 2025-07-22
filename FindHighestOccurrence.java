import java.util.HashMap;

public class FindHighestOccurrence {
    	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c) + 1);
            }else{
                charCount.put(c, 1);
            }
        }
        int maxCount = 0;
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > maxCount) {
                maxCount = charCount.get(c);
            }
        }
        return maxCount;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}
