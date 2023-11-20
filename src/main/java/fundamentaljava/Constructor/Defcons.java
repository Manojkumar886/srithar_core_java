package fundamentaljava.Constructor;

public class Defcons 
{
    int a;
    float b;
    String name;
    public  Defcons()  //Default constructor
    {
        System.out.println(" my default constructor is working");
        System.out.println("a value :"+a+"\n b value"+b);
        System.out.println(" my name is "+name);
    }

    public static void main(String[] args) 
    {
        // Defcons obj=new Defcons();//object initiazation

        new Defcons();
    }
    
}
