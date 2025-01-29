import java.util.*;
class NumberGame
{
    static void game()
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int rand_num=rand.nextInt(100)+1;
        //System.out.println(rand_num);
        int attempts=10;
        int user_guess;
        
        
        System.out.println("Welcome to the Number Guessing Game..");
        System.out.println("I'am give a random number between 1to 100");
        while(attempts>0)
        {
            if(attempts>1)
            {
                System.out.println("You have "+ attempts +" attempts ");
            }
            else
            {
                System.out.println("Last attempt to guess the correct number");
            }
            System.out.println("Give your Guess to correct answer:");
            user_guess=sc.nextInt();
            
            if(user_guess>rand_num)
            {
                System.out.println("Too High");
            
            }
            else if(user_guess<rand_num)
            {
                System.out.println("Too Low");
                
            }
            else{
                int x=(10-attempts)+1;
                System.out.println("You got it correct answer by using "+x+" attempts");
                return;
            }
            if(attempts==1)
            {
                System.out.println("Game over");
            }
            attempts -=1;
        }
        
    }
    
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        boolean play=true;
        while(play==true)
        {
           System.out.println("Do you want to play NumberGame ,Type 'y' if yes and 'n' to quit.");
           String user=sc.nextLine();
           if(user.equals("y"))
           {
               game();
           }
           else{
               play=false;
           }
        }
        
    }
}
