package fundamentaljava.Array;

import java.util.Arrays;

public class PassingAnArray 
{
    
    float weight;

    public PassingAnArray(String [] Fruits ,float weight)
    {
        Fruits[1]="grapes";
        System.out.println(Arrays.toString(Fruits));
        this.weight=weight;

        System.out.println(" Global variable value is :"+weight);
    }
    public static void main(String[] args) 
    {
        String Fruits[]={"Apple","Banana","Mango"};
        PassingAnArray array=new PassingAnArray(Fruits, 134.4f);

        
    }
    

}
