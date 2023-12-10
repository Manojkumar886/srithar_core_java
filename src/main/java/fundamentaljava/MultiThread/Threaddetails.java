package fundamentaljava.MultiThread;

public class Threaddetails 
{
    public static void main(String[] args) 
    {
        ArrayCrudl a1=new ArrayCrudl();
        
        
        Thread th1=new Thread("Manoj")
        {
            public void run()
            {
                a1.LIST();
            }
        };
        Thread th2=new Thread(" Sridhar")
        {
            public void run()
            {
                a1.LIST();
            }
        };
        Thread th3=new Thread("Thakkali")
        {
            public void run()
            {
                a1.LIST();
            }
        };


        th1.start();
        th1.setPriority(1);
        th2.start();
        th2.setPriority(10);
        th3.start();
    }
}



class ArrayCrudl
{
    String SmartTVBRANDS[]={"Redmi","Onida","videocan","SONY","LG"};

     synchronized public void LIST()
    {
        // current thread name and id and priority checking method
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        UPDATE();
        for(String tvbrands: SmartTVBRANDS)
        {
            System.out.println(tvbrands);
        }
    }

    public void UPDATE()
    {
        int pos=2;
        String newtv="Xiomi";
        SmartTVBRANDS[pos]=newtv;
    }
}