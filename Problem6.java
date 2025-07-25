// Find out all the possible permutations of the characters in the string passed to the method findPermutations(). Implement the logic inside findPermutations() method and return a string array containing all the permutations.

// Assumption: The length of the string will be 3.

// E.g.: For the string "abc", the permutations will be abc, acb, bac, bca, cab and cba.

import java.util.Set;
import java.util.HashSet;

public class Problem6 {
    public static String[] findPermutations(String str){
        //Implement your code here and change the return value accordingly
        if (str == null || str.length() != 3) {
            return new String[0]; // Return empty array if input is invalid
        }
       
        Set <String> uniquePermutations = new HashSet<>();
        
        // Generate all permutations
        uniquePermutations.add(str);
        uniquePermutations.add(str.charAt(0) + "" + str.charAt(2) + "" + str.charAt(1));
        uniquePermutations.add(str.charAt(1) + "" + str.charAt(0) + "" + str.charAt(2));
        uniquePermutations.add(str.charAt(1) + "" + str.charAt(2) + "" + str.charAt(0));
        uniquePermutations.add(str.charAt(2) + "" + str.charAt(0) + "" + str.charAt(1));
        uniquePermutations.add(str.charAt(2) + "" + str.charAt(1) + "" + str.charAt(0));
        return uniquePermutations.toArray(new String[0]);
    }
    
    public static void main(String args[]){
        String str = "abc";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
    }
}
