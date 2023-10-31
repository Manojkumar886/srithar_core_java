package Looping;

import java.util.Scanner;

public class DemoForloop 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int count=0;
        for(int vacancy=1;vacancy<=10;vacancy++)
        {
            System.out.println("Vacancy NO :"+vacancy+"\n Enter your Experience");
            int exp=scan.nextInt();
            if((exp>=2)&&(exp<=5))
            {
                System.out.println(" you are selecetd in this recuriement");
                count++;
            }
            else
            {
                System.out.println(" you are not selected to this position");
            }

        }
        System.out.println(" total no of person seleceted in this round "+count);
    }
}
