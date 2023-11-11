package fundamentaljava.Array;

import java.util.Scanner;

public class JaggedArraysize 
{
    public static void main(String[] args) 
    {

        System.out.println(" SKS Hospital Patiend List in Floors");


        // String patiend1={{"Manoj","Sridhar","annamalai"},{"A","B","C","D"},{"E","F"}};

        String [][] patient=new String [3][];

        patient[0]=new String [3];
        patient[1]=new String [4];
        patient[2]=new String [2];

        for(int row=0;row<patient.length;row++)
        {
            for(int column=0;column<patient[row].length;column++)
            {
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter Patiend name - ROOMNO "+row+" Row"+column+" ROOM");
                patient[row][column]=scan.nextLine();
            }
        }

        System.out.println(" my Patiend List :");

        for(int row=0;row<patient.length;row++)
        {
	        for(int column=0;column<patient[row].length;column++)
	        {
		        System.out.print(patient[row][column]+ " ");
	        }
	            System.out.println();
        }    

        
    }
}
