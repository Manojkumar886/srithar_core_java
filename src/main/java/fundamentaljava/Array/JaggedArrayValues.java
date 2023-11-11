package fundamentaljava.Array;

public class JaggedArrayValues 
{
    public static void main(String[] args) 
    {
        int [ ] [ ]   tvsize= { {1,2} ,{22,33,44} , {55,66,777,88} };
// 1 	2
// 22 	33 	44
// 55 	66 	777 88

        for(int row=0;row<tvsize.length;row++)
        {
	        for(int column=0;column<tvsize[row].length;column++)
	        {
		        System.out.print(tvsize[row][column]+ " ");
	        }
	            System.out.println();
        }    
    }
    
}
