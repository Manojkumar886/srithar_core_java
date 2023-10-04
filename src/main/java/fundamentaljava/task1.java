package fundamentaljava;

public class task1
{
    public static void main(String[] args) 
    {
        task1 tc=new task1();

        tc.typecasting(166.5, 21, "Manoj");

        tc.addition(21);
    }

    public void typecasting(double height,int age,String name)
    {
        System.out.println(" my name is : "+name);
        System.out.println(" my age is "+age);
        System.out.println(" manojkumar height is "+height);
    }

    public void addition(int age)
    {
        age=age+100;//21+100
        System.out.println(" my age is count by plus     100 :"+age);

    }
    
}
