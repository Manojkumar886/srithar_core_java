package fundamentaljava;

public class MethodsActivations 
{
    public void Sample1()
    {
        char myinitial='M';
        short myinitialascii=(short)myinitial;//77
        System.out.println(" my initial is M -that Asci value is "+myinitialascii);
        System.out.println(" this method is without Rt and Argu");

    }

    public void Sample1(int a)
    {
        a=a*21;//
        System.out.println("my a value is multiple by 21 :"+a);
    }

    public int Sample1(float weight)
    {
        System.out.println(" my weight is : "+weight);
        return 99;
    }
    public int Sample1(String name)
    {
        System.out.println("my name is "+name);
        return 1;
    }


    public static void access()
    {
        System.out.println(" Checking");
    }


    public static void main(String[] args) 
    {
        // classname objectname=new Classname();
        // object-object is created by class but used to calling a method.
        // inside a class but outside a main method
        // runtime memory allocation
        MethodsActivations obj=new MethodsActivations();
        MethodsActivations object=new MethodsActivations();
        object.Sample1("Manoj");
        object.Sample1(89.9f);
        obj.Sample1();
        obj.Sample1(10);

        float myweight=55.6f;

        int getting=obj.Sample1(myweight);

        System.out.println(" Sample1 with floating parameter method is return by "+getting);

        access();
    }
}
