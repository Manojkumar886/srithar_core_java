package fundamentaljava.TypeofOperator;

public class BitwiseOperator 
{
    public static void main(String[] args) 
    {
        int myclasscount=45;
        int myschoolcount=150;

        System.out.println(myclasscount&myschoolcount);//AND -4
        System.out.println(myclasscount|myschoolcount);//OR -191
        System.out.println(myclasscount^myschoolcount);//XOR - 187
        // ^-circumflex

        System.out.println("my class count is :"+myclasscount+"\nmyschoolcount is :"+myschoolcount+"\n thank you");
    }
    
}


// AND a=45 ,b=150
// 			128 	64	32	16	8	4	2	1
//  a=45		0	0	1	0	1	1	0	1		
// b=150		1	0	0	1	0	1	1	0

// a&b			0	0	0	0	0	1	0	0	=4

// OR a=45 ,b=150
// 			128 	64	32	16	8	4	2	1
//  a=45		0	0	1	0	1	1	0	1		
// b=150		1	0	0	1	0	1	1	0

// a|b			1	0	1	1	1	1	1	1 =128+32+16+8+4+2+1 =191

// XOR a=45 ,b=150
// 			128 	64	32	16	8	4	2	1
//  a=45		0	0	1	0	1	1	0	1		
// b=150		1	0	0	1	0	1	1	0

// a^b			1	0	1	1	1	0	1	1=128+32+16+8+2+1=187
