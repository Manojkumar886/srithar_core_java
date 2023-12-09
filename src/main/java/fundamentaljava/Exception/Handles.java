package fundamentaljava.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handles 
{
    public static void main(String[] args) 
    {
    //    try{
    //      String name=null;
    //     System.out.println(name.length());
    //    }
    //    catch(NullPointerException npe)
    //    {
    //         System.out.println(npe);
    //    }
    //    finally
    //    {
    //     System.out.println(" your memory is null");
    //    }
         
        try
        {
            Scanner scan=new Scanner(System.in);
            System.out.println(" a and b values :");
            int a=scan.nextInt();
            int b=scan.nextInt();
            System.out.println(a/b);
            try{
                System.out.println(" please tell us any content");
                String content=scan.next();
                System.out.println(content.substring(10, 100));
            }
            catch(StringIndexOutOfBoundsException siobe)
            {
                System.out.println(siobe);
            }
            finally
            {
                System.out.println("successfully...!");
            }
        }
        catch(ArithmeticException ar)
        {
            System.out.println("divided value is zero,please change in without zero");
        }
        catch(InputMismatchException ime)
        {
            System.out.println(ime+" enter only numeric");
        }
        finally
        {
            System.out.println(" thank you");
        }


        for(int i=0;i<=10;i++)
        {
            System.out.print(i+" ");
        }
    }
}
