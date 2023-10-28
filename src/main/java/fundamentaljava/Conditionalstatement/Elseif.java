package fundamentaljava.Conditionalstatement;

import java.util.Scanner;

public class Elseif 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("---------welcome to Poorivka Mobiles Shop------\n");
        System.out.println(" please tell us which amount of Mobile you want");
        int price=scan.nextInt();

        if((5000<=price)&&(price<=10000))
        {
            System.out.println(" you only buy seconds Mobiles or else all brand 2gb Ram only buy this Price");
        }
        else if((10001<=price)&&(price<=20000))
        {
            System.out.println(" you buy Realme and Redmi and Nokia 4gb ram mobile buy this amout");
        }
        else if((20001<=price)&(price<=30000))
        {
            System.out.println("currently available for this amoutn brands:one plus,Vivo,OPPO");
        }
        else
        {
            System.out.println(" Currently not available for our requirement(amount)");
        }
        
    }
    
}
