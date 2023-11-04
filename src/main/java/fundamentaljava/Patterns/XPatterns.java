package fundamentaljava.Patterns;

public class XPatterns 
{
    public static void main(String[] args) 
    {
        String Name="manoj";

        for(int i=0;i<Name.length();i++)
        {
            int j=Name.length()-1-i; //7-1-0  =6

            for(int k=0;k<Name.length();k++)
            {
                if((k==i) ||(k==j) )
                {
                    System.out.print(Name.charAt(k));  
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }      
    } 
}
