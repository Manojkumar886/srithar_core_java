package fundamentaljava.Inheritance;

public class IFCONNECT implements IFclass
{

   public void sample()
   {
        System.out.println(" char to int");
        char gender='M';
        int Mvalue=gender;

        System.out.println(" gender is :"+gender+"\n M asci value :"+Mvalue);
   }
   public void simple()
   {
        System.out.println(" Simple methos is implement to another class");
   }
   public void basic()
   {
    System.out.println(" Current class method is Running");
   }    

   public static void main(String[] args) 
   {
        IFCONNECT connect=new IFCONNECT();
        connect.basic();
        connect.simple();
        connect.sample(); 
   }
    
}
