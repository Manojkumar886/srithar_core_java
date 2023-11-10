package fundamentaljava.Array;

public class Two_DArray
{
    public static void main(String[] args) 
    {
        int [][] Nestle=new int[3][3];

        int [][] Nestle1={{1,2,3},{4,5,6},{6,7,8}};

        // Nestle[0][0]=22;
        // Nestle[0][1]=44;
        // Nestle[0][2]=66;

        // Nestle[1][0]=11;
        // Nestle[1][1]=33;
        // Nestle[1][2]=55;

        // Nestle[2][0]=77;
        // Nestle[2][1]=88;
        // Nestle[2][2]=99;


        // for(int row=0;row<=2;row++)
        // {
        //     for(int column=0;column<3;column++)
        //     {
        //         System.out.print(Nestle[row][column]+" ");
        //     }
        //     System.out.println();
        // }        


        int count=2;

        for(int row=0;row<3;row++)
        {
            for(int column=0;column<=2;count++)
            {
                Nestle[row][column]=count;
                count+=2;
                
            }
        }

         for(int row=0;row<=2;row++)
        {
            for(int column=0;column<3;column++)
            {
                System.out.print(Nestle1[row][column]+" ");
            }
            System.out.println();
        }    
        // for-each
        // for(int twotoone[] :Nestle)
        // {
        //     for(int onetonoremal : twotoone)
        //     {
        //         System.out.print(onetonoremal);
        //     }
        //     System.out.println();
        // }
    }
}
