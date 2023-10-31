package Looping;

import java.util.Scanner;

public class DemoDowhile
{
    public static void main(String[] args)
    {
        // int a=10;

        // do{
        //     System.out.println(" my value is "+a);
        //     a+=10;//increment
        // }
        // while(a<=100);

        // System.out.println(" your loop is over -Thank you");


        int count=0;
        int staff=10;

        do
        {
            Scanner scan=new Scanner(System.in);
            System.out.println(" Current Staff no "+staff);
            
            System.out.println(" Enter your time");
            float time=scan.nextFloat();
            if(time>=9.15)
            {
                System.out.println(" you are late comer-so salary is deducted 10%");
                count++;
            }
            else{
                System.out.println(" you are come to good time -keep it up ");
            }
            staff--;
        }
        while(staff>0);

        System.out.println(" today late comer staff count is "+count);
    }

}