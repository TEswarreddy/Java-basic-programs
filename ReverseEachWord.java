import java.util.Scanner;

public class ReverseEachWord {
    public static String reverseWords(String str){
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word:words){
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            reversed.append(sb.toString());
            reversed.append(" ");
        }
        if(reversed.length() > 0){
            reversed.deleteCharAt(reversed.length()-1);
        }
        
        return reversed.toString();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(reverseWords(input));
        sc.close();
    }
}
