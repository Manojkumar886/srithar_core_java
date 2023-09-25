package fundamentaljava;

public class DemoTypeCasting 
{
    public static void main(String[] args) 
    {
        // widening(Smallest to largest)
        // byte---->Short--->char----->int---->long----->float----->double(bscilfd)

        char initial='z';//ascii numbers

        int intialconvertascii=initial; //datatype variablename= data;
        
        float inttofloat=intialconvertascii;

        //  int a=10;
        //  double b=a;
        System.out.println("My Intial is :"+initial+"\n my intial ascii no is :"+intialconvertascii+"\n my integer value is converted to float :"+inttofloat);
        System.out.println("Widenning is over \t start a narrwoing");
        // Narrowing(largest to smallest)
        // double--->float--->long---->int--->char----->short---->byte


        double weight=62.56;

        int fullvalueofweight=(int)weight;  //fullvalueofweight=62

        char inttochar=(char)fullvalueofweight;  //inttochar=

        short chartoshort=(short)inttochar;

        System.out.println("my double value is "+weight+"\n double to integer value "+fullvalueofweight+"\nint to char "+inttochar+" \nchar to short :"+chartoshort);



        
    }
    
}
