package fundamentaljava;

public class ArithemeticOperator 
{
    public static void main(String[] args) 
    {
        ArithemeticOperator object=new ArithemeticOperator();
        // System.out.println(" my monthly salary is:"+  object.DemoArithemetic(650, 25));
          int copylocalvariable=object.DemoArithemetic(650, 25);
        System.out.println(" my salary is :"+copylocalvariable);
    }

    public int DemoArithemetic(int perdaysalary,int workingday)
    {
        float monthlysalary=perdaysalary*workingday;//650*25=16250

        monthlysalary+=750;//16250+750----->17000 ///Assignment Operator
        return (int)monthlysalary;//narrowing
        
    }
    
}
