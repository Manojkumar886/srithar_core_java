package fundamentaljava.Array;

import java.util.Scanner;

public class InsertingArray 
{
    public static void main(String[] args) 
    {
        // new -runtime memory allocation
        // Scanner scans=new Scanner(System.in);
        // System.out.println(" how many section in your name");
        // int sectionsize=scans.nextInt();

        char [] Sectiondetails=new char[5];
        // Sectiondetails[0]='V';
        // Sectiondetails[1]='I';
        // Sectiondetails[2]='J';
        // Sectiondetails[3]='A';
        // Sectiondetails[4]='Y';

        // inserting an array
        for(int i=0;i<Sectiondetails.length;i++)
        {
            int index=0;
            Scanner scan=new Scanner(System.in);
            System.out.println("Adding "+i+" position");
            Sectiondetails[i]=scan.next().charAt(index);
        }

        // reverse order
        for(int size=Sectiondetails.length-1;size>=0;size--)
        {
            System.out.println(size+" size of array value is Reverse Order :"+Sectiondetails[size]);
        }
        //for-each loop
        for(char user: Sectiondetails)
        {
            System.out.print(user);
        }
    }
}
