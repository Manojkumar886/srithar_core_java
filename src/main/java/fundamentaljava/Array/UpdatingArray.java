package fundamentaljava.Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingArray 
{
    public static void main(String[] args) 
    {
        float listofweights[]={60.5f,75.5f,82.3f,95.8f,99.9f,100.0f};

        System.out.println("Before update my array values \n"+Arrays.toString(listofweights));
        
        Scanner scan=new Scanner(System.in);
        System.out.println(" Please tell us which index of value you want update");
        int pos=scan.nextInt();
        System.out.println("you are change to "+pos+"position "+listofweights[pos]+"\n please enter your new value/replace value ");
        float newvalue=scan.nextFloat();

        listofweights[pos]=newvalue; //lisofweights[5]=110.78;

        System.out.println("After updated my array values");

        for(float newweights: listofweights)
        {
            System.out.print(newweights+",");
        }

    }
}
