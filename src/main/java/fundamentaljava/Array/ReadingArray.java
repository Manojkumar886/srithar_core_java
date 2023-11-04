package fundamentaljava.Array;

import java.util.Scanner;

public class ReadingArray
{

    public static void main(String[] args)
    {

        String ProkabaddiTeams[]={"tamilThalaivas","Umumba","JaipurPinkBanders","PatnaPirates","Heryana Steelers","TeluguTitens","BengaloruBulls","GujaratFGiants","DabangDelhi","BengalWarriors"};
        
        Scanner scan=new Scanner(System.in);

        // System.out.println(" which index of value you want");
        // int pos=scan.nextInt();

        // System.out.println("you are choose to "+pos+" in the position of value is "+ProkabaddiTeams[pos]);


        // System.out.println(" my last position of value is :"+ProkabaddiTeams[ProkabaddiTeams.length-1]);

        // Searching of array

        System.out.println(" what is your favoriate team name");
        String favoriatename=scan.nextLine();

        for(int pos=0;pos<ProkabaddiTeams.length;pos++)
        {
            if(ProkabaddiTeams[pos].equalsIgnoreCase(favoriatename))
            {
                System.out.println(" your favoriate team position is "+pos);
                return;
            }
        }

        System.out.println("your favoriate team not in my club");

    }
    
}
