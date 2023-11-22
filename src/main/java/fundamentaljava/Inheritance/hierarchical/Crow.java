package fundamentaljava.Inheritance.hierarchical;

public class Crow extends Birds
{
    void Sound()
    {
       System.out.println(" Crow Sound is Kha Kha Kha"); 
    }
    public static void main(String[] args) 
    {
        Crow khakha=new Crow();
        khakha.Sound();//current class method
        khakha.Eating();//Birds class method name 
    }
}
