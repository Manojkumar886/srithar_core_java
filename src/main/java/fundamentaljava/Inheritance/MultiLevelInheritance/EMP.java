package fundamentaljava.Inheritance.MultiLevelInheritance;

public class EMP extends TL
{
    public void Workers()
    {
        System.out.println("A person who is involved in production activity contributing to the flow of goods and services in the economy is called a worker.");
    }

    public static void main(String[] args)
    {
        EMP employee=new EMP();

        employee.Workers(); //Current Class Function
        employee.TL("Sridhar");  //TL class function
        employee.hrwork();//HR class function


        
    }
    
}
