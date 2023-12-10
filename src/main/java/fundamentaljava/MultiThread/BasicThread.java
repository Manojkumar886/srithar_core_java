package fundamentaljava.MultiThread;

public class BasicThread
{    
    public static void main(String[] args) throws InterruptedException  //main thread
    {
        //  using extends thread class cannot need Thread class object.
        p1 obj1=new p1();
        obj1.start();
        
        if(obj1.isAlive())
        {
            System.out.println(" still working");
        }

        obj1.join();//it will wait for a thread in terminated
        // using implements runnable interface must created thread class object, 
        // connect class to thread object
        p2 obj2=new p2();
        Thread th=new Thread(obj2);
        th.start();

        th.join();
        
        if(obj1.isAlive())
        {
            System.out.println(" still working");
        }
        // main thread
        System.out.println(" main thread....!");
        
    }    
}


class p1 extends Thread 
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(" my value is "+i);
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException ie)
            {

            }
        }
    }
}


class p2 implements Runnable
{
    public void run()
    {
        int i=5;
        for(int n=1;n<=5;n++)
        {
            System.out.println(n+"X"+i+"="+(n*i));
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException ie)
            {

            }
        }
    }
}