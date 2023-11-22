package fundamentaljava.Inheritance.SingleInheritance;

public class Class_2 extends Class_3
{

    public void SON()
    {
        System.out.println(" second class method name is SON()");
    }
    public static void main(String[] args) {
        Class_2 two=new Class_2();
        two.SON();
        two.odd();
    }
}

class Class_3
{
    public void odd()
    {
        int a=4;
        if(a%2!=0)  //a-(a/2)*a-->4-(4/2)*2-->4-(2*2)-->4-4->0
        {
            System.out.println("odd number");
        }
        else
        {
            System.out.println("even number");
        }
    }
}