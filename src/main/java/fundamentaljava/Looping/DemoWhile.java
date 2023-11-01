package fundamentaljava.Looping;

import java.util.Scanner;

public class DemoWhile 
{
    public static void main(String[] args) 
    {
    // inifinity time
    // while(true)
    //     {
    //         System.out.println("Infinity Chances");
    //     }


        int available=20;
        int topayable;
        int quantity;
        int payamount;
        
        while(available>0)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println(" how many redmi mobile you want buy ");
            quantity=scan.nextInt();
            if(quantity>available)
            {
                System.out.println("only"+available+" Available");
            }
            else
            {
                topayable=quantity*18000;
                System.out.println("you pay to "+topayable);
                System.out.println(" enter your amount:");
                payamount=scan.nextInt();
                if(topayable<=payamount)
                {
                    System.out.println(" you bought redmi mobiles of "+quantity);
                }
                else
                {
                    System.out.println("insufficient amount");
                }
                available-=quantity;//20-4=16
                System.out.println(" currently available quantity"+available);
            }
        }
    } 
}
