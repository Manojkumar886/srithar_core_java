package fundamentaljava.Exception;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Throwkey 
{
   public void access()
   {
        try
        {
            throw new NullPointerException();
        }
        catch(NullPointerException npe)
        {
            System.out.println(" method npe");
            throw npe;
        }
   
    }

    public static void main(String[] args) 
    {
        Throwkey key=new Throwkey();
        try
        {
            key.access();
        }
        catch(NullPointerException npe1)
        {
            System.out.println(" throw npe exception by method");
        }
        
    }

}
