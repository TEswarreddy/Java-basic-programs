// You are using Java

class Main 
{
    public static void main(String args[])
    {
        
        String sentence="hello my name is tanish";
        int count=0;
        int max=0;
        String s=" ";
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i)!=s.charAt(0))
            {
                count++;
                //System.out.println(count);
            }
            else
            {
                // if(count>max)
                // {
                //     max=count;
                // }
                count=0;
            }
            max = Math.max(max,count);
        }
        
        System.out.println(max);
        
    }
}