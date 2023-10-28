package fundamentaljava.Conditionalstatement;

import java.util.Scanner;

public class NestedIf
{
    public void innerouterblock(int cbscr)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("-----Welcome to Credit Card section----");
        if(cbscr>=600)//outerblock
        {
            System.out.println(" your Profile is shortlisted for loan amount");
            System.out.println(" enter your per annum salary");
            double Salary=scanner.nextDouble();
            if((Salary>=2.6)&&(3.6>=Salary))//innerblock
            {
                System.out.println("you are eligible 2lakhs Loan Section");
            }
            else if((Salary>=3.7)&&(5.0>=Salary))
            {
                System.out.println(" you profile loan amount is -5lakhs");
            }
            else
            {
                System.out.println(" not eligible for your Perannum Package");
            }
        }
        else
        {
            System.out.println(" your cibil score is low");
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter your Cibil Score");
        int cibilscore=scan.nextInt();

        NestedIf nest=new NestedIf();   

        nest.innerouterblock(cibilscore);

    }
}