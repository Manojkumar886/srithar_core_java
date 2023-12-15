package fundamentaljava.Encapsulation;

public class Declare 
{
    private int age;
    private String name;

    @Override
    public String toString() 
    {
        return "Declare [age=" + age + ", name=" + name + "]";
    }

    public void setAge(int age)
    {
        this.age=age;   
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }


    
}
