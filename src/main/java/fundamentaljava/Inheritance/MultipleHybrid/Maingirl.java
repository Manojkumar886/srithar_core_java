package fundamentaljava.Inheritance.MultipleHybrid;

public class Maingirl extends Normal implements Sister,Mother,Future 
{
    // Future interface class no implement method is implemented to other class.
    public void wifedetails(String wifename,int wifeage)
    {

    }
    // Sister
    public void eldersister(String eldersistername)
    {
        System.out.println(" my elder sister name is :"+eldersistername);
    }
    // Mother
    public void mother()
    {

    }
    // current class
    public void girl()
    {
        System.out.println("“That girl” is a social media lifestyle trend that refers to women who prioritize wellness, productivity, beauty and mindfulness.");
    }

    public static void main(String[] args) 
    {
        Maingirl girl=new Maingirl();
        girl.eldersister("Pavithra");
        
    }
    
}
