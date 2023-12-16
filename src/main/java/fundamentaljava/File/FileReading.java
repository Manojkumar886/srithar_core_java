package fundamentaljava.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading 
{
    public static void main(String[] args)  throws IOException
    {
        File file=new File("E:\\FundamentalJava\\Constructor.txt");
       FileInputStream fis=new FileInputStream(file);// occured to filenotfoundexception
       int size=fis.available(); // occured to IO Exception
        byte [] getbytevalues=new byte[size];

        fis.read(getbytevalues);

        String bytetoString=new String(getbytevalues);

        System.out.println(bytetoString);

        fis.close();
    }    
}
