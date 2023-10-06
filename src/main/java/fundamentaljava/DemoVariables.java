package fundamentaljava;

public class DemoVariables 
{
    //Instance ,Local,Global,Static
    int EPmtoRspmKM=24;//global variable
    static float EpmtoRspmCost=15.00f;//static variable
    
    public void accesslocal()
    {
        String place="Elachipalayam";//Local variable
        System.out.println(" My native place is :"+place);
        
        System.out.println(" my global value is KM :"+EPmtoRspmKM);//global variable accessed
        System.out.println(" my bus cost is :"+EpmtoRspmCost);//static   variable accessed
    }
    public static void main(String[] args) 
    {
        String username="ManddyMano@434";//Instance variable

        System.out.println(" my github username is :"+username);
       

        DemoVariables demo=new DemoVariables();

        demo.accesslocal();

        System.out.println(" my bus cost is :"+EpmtoRspmCost);//static variable accesses
        
    }
    
}
