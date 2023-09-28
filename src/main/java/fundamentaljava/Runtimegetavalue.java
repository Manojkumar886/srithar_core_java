package fundamentaljava;

import java.util.Scanner;

public class Runtimegetavalue
{
    public static void main(String[] args) 
    {
        Runtimegetavalue run=new Runtimegetavalue();//current class object creation
        // classname objname=new classname();
        Scanner scan=new Scanner(System.in);//runtime class object creation

        System.out.println("what is your name : \n");

        String fullname=scan.nextLine();

        System.out.println("What is your age : \n");

        int age=scan.nextInt();

        System.out.println(" what is your 12th Percentage : \n");

        double percentage=scan.nextDouble();

        System.out.println(" your ration card is active or not(true/false)");

        boolean active=scan.nextBoolean();

        System.out.println(" my name is :\t "+fullname+"\n my age is :\t"+age+"\n my 12th percentage is : \t "+percentage);
        
        System.out.println(" your ration card active is :"+active);
    }
}
