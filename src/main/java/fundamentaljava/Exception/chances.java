package fundamentaljava.Exception;

import java.util.Scanner;

public class chances 
{
   static Scanner scan=new Scanner(System.in);

    public static void infinite(String content)
    {
        try{
            System.out.println("starting index :");
            int start=scan.nextInt();
            System.out.println("ending index :");
            int end=scan.nextInt();
            System.out.println(content.substring(start,end));
        }
        catch(StringIndexOutOfBoundsException siobe)
        {
            System.out.println(siobe);
            infinite(content);
        }
    }


    public static void finite(int chances,String content)
    {
         try{
            System.out.println("starting index :");
            int start=scan.nextInt();
            System.out.println("ending index :");
            int end=scan.nextInt();
            System.out.println(content.substring(start,end));
        }
        catch(StringIndexOutOfBoundsException siobe)
        {
            System.out.println(siobe);
            if(chances<=2)
            {
                chances++;
                finite(chances, content);
            }
            else{
                System.out.println(" max attempt is over...!");
            }
        }
    }

    public static void main(String[] args) 
    {
        String content="data,conditon,situation particular problem is executed,which lead the application to be terminated abnormallyincompletely.";
        finite(1, content);
        // infinite(content);
    }   
    
}
