package fundamentaljava.Encapsulation;

public class Process 
{
    public static void main(String[] args) 
    {
        Declare encap=new Declare();
        encap.setAge(22);
        encap.setName("manojkumar");

        System.out.println(" my age is :"+encap.getAge());

        System.out.println("my name is :"+encap.getName());
        
    }
    
}
