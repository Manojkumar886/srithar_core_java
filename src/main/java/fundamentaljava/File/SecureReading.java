package fundamentaljava.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class SecureReading 
{
    public static void main(String[] args)  throws FileNotFoundException,IOException
    {
        String location="D:\\SritharFiles\\securefile.doc";
        File file=new File(location);
        
        FileInputStream fis=new FileInputStream(file);

        InflaterInputStream iis=new InflaterInputStream(fis);

        int size=fis.available();

        byte [] getvalues=new byte[size];

        iis.read(getvalues);

        String bytetoString=new String(getvalues);

        System.out.println(bytetoString);

        fis.close();
        iis.close();
    }    
}
