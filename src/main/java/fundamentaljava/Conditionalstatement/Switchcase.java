package fundamentaljava.Conditionalstatement;

import java.util.Scanner;

public class Switchcase 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);

        System.out.println(" enter your favoriate no with in below 10");
        int yourno=scan.nextInt();

        switch(yourno)
        {
            case 1:
            System.out.println("your Favoriate value is ONE");
            break;
            case 2:
            System.out.println(" your favoriate number is TWO");
            break;
            case 10:
            System.out.println(" your favoriate value is TEN");
            break;
            default:
            System.out.println("your favoriate value is NOt Matching");
        }
        
    }
    
}
