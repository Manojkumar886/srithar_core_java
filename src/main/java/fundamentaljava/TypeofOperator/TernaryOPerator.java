package fundamentaljava.TypeofOperator;

import java.util.Scanner;

public class TernaryOPerator 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter Your age");
        int age=scan.nextInt();
        
        String result=  (age>18)?
                        " you can eligible for vote" :
                        (age==18)?
                        "you are waiting one year":
                        
                        " you can't eligible for vote";
                        System.out.println(result);   
                        
        

    }
}
