package fundamentaljava.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class SecureWriting 
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("D:\\SritharFiles\\securefile.doc");
        // file.createNewFile();// IO Exception 
        
        FileOutputStream fos=new FileOutputStream(file);

        DeflaterOutputStream dos=new DeflaterOutputStream(fos);
        
        String content="The available() method of FileInputStream class is used to return the estimated number of remaining bytes that can be read from the input stream without blocking. This method returns the number of bytes remaining to read from the file. When a file is completely read, this function returns zero. ";

        dos.write(content.getBytes());

        dos.close();
        fos.close();
    }    
}
