package fundamentaljava.Exception;

import java.io.IOException;

public class runtime 
{
    public static void main(String[] args) throws IOException,InterruptedException
    {
        Runtime run =Runtime.getRuntime();
        Process pro;
        pro=run.exec("notepad");
        Thread.sleep(4000);
        pro=run.exec("calc");

    }

}
