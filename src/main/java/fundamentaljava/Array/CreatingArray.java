package fundamentaljava.Array;

import java.util.Arrays;

public class CreatingArray 
{
    public static void main(String[] args) 
    {
        int a=10;
        System.out.println(" my value is :"+a);


        String [] Chocolatenames ={"KitKat","Nestle","Munch","FiveStar","Park","Diarymilk","Milkybar"};

        // System.out.println("My favoriate ChocolateNames:"+Arrays.toString(Chocolatenames));        

        // System.out.println(" my fourth position value is :"+Chocolatenames[4]);

        // for(int pos=0;pos<Chocolatenames.length;pos++)
        // {
        //     System.out.println(pos+" position of value is :"+Chocolatenames[pos]);
        // }

        // for-each Loop
        // for(String newvariablename : currentvariablename)
        // {
        //     System.out.println(newvariablename);
        // }


        for(String getting : Chocolatenames)
        {
            System.out.println(getting);
        }
    }
    
}
