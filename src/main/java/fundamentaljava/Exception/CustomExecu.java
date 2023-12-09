package fundamentaljava.Exception;

import java.util.Scanner;

public class CustomExecu 
{
    public static void main(String[] args)
    {
        try{
            Scanner scan=new Scanner(System.in);
            System.out.println(" Enter your age ");
            int age=scan.nextInt();
            if(age<=18)
            {
                throw new InvalidAgeException();
            }
            System.out.println(" your age is :"+age);
        } 
        catch(InvalidAgeException ige)
        {
            System.out.println(ige);
        }
    }    
}
