package fundamentaljava.Constructor;

public class Paracons 
{
    String name;
    int age;

    public Paracons(String name,int vayasu)//parameterized constructor
    {
        this.name=name;
        age=vayasu;
        displayvalue();
    }


    public void displayvalue()
    {
        System.out.println(" globalvariable  name is :"+name);
        System.out.println("globalvariable age is :"+age);
    }

    public Paracons () //default constructor
    {
        System.out.println(" welcome to constructor concept:");
        System.out.println(name +" "+age);
    }

    public static void main(String[] args) 
    {
        // new-runtime memory allocation
        new Paracons("Srithar", 22);    
        new Paracons("Manojkumar", 23);
        new Paracons();
        Paracons obj=new Paracons("Pavithra", 24);

        obj.displayvalue();
    }
}
