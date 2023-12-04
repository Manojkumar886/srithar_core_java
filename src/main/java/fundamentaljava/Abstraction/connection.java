package fundamentaljava.Abstraction;

public class connection extends Fruits
{

    public void Banana()
    {
         System.out.println("A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa.");
    }

    public void guava()
    {
        System.out.println("Guavas are tropical trees originating in Central America. Their fruits are oval in shape with light green or yellow skin");
    }

    public static void main(String[] args) 
    {
        connection connect=new connection();
         //object name-unique id,object using func calling -state ,function arguments and perforamnce behaviours
        connect.Banana();//no implementation methods
        connect.Mango();//implementation methods
        connect.guava();//current class method    
    }
    
}
