package fundamentaljava.Inheritance.SingleInheritance;

public class Class_1 extends Class_2
{
    public void Parent()
    {
        System.out.println("a source, origin, or cause. a protector or guardian. Biology. any organism that produces or generates another.");
    }

    public static void main(String[] args) 
    {
        Class_1 obj=new Class_1();//object is created to current class
        obj.Parent();
        obj.SON();//Other class method access using inheritance concept
    }   
}