// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        String s="madam";
        String t="madam";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
         for(int i=0;i<t.length();i++){
            char x=t.charAt(i);
            if(map.containsKey(x)){
                map.put(x,map.get(x)-1);
                
            }
            else{
                System.out.println("not anagram");
            }
        }
        int c=0;
        for(int count:map.values()){
            if(count == 0)
            {
                c++;
            }
        }
        if(c==map.size())
        {
            System.out.println("Anagram");
        }
        
        
    }
}
