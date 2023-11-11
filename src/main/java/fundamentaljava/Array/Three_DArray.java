package fundamentaljava.Array;

public class Three_DArray
{
    public static void main(String[] args) 
    {   
        int [][][] DOLBYPOINT=new int [3][4][2];

        for(int row=0;row<DOLBYPOINT.length;row++)
        {
            for(int column=0;column<DOLBYPOINT[row].length;column++)
            {
                for(int values=0;values<DOLBYPOINT[row][column].length;values++)
                {
                        DOLBYPOINT[row][column][values]=column*2;
                }
            }
        }
        
        // print values
        for(int row=0;row<DOLBYPOINT.length;row++)
        {
            for(int column=0;column<DOLBYPOINT[row].length;column++)
            {
                System.out.print("{");
                for(int values=0;values<DOLBYPOINT[row][column].length;values++)
                {
                       System.out.print(DOLBYPOINT[row][column][values]+" ");
                }
                System.out.print("}");
            }
            System.out.println();
        }

    }
}
