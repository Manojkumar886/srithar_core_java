package fundamentaljava.MultiThread;

public class synckey
{
    public static void main(String[] args) 
    {
        table t1=new table();
        
        Thread th1=new Thread()
        {
            public void run()
            {
                t1.tables(10);
            }
        };

        Thread th2=new Thread()
        {
            public void run()
            {
                t1.tables(90);
            }
        };

        Thread th3=new Thread()
        {
            public void run()
            {
                t1.tables(11);
            }
        };
        th3.start();
        th1.start();
        th2.start();
    }
}


class table
{
    synchronized public void tables(int i)
    {
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