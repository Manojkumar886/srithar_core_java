package fundamentaljava.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Filewriting 
{public static void main(String[] args) throws FileNotFoundException
    {
        File file=new File("D:\\SritharFiles\\fileconcept.txt");
        // file.mkdir();
        // try{
        //     file.createNewFile();
        // }
        // catch(IOException io)
        // {

        // }
        // System.out.println(file.getName()+" has been created successfully");
        
        FileOutputStream fos=new FileOutputStream(file);
        String fileDefine="Java File Class. The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.";
        try {
            fos.write(fileDefine.getBytes());
            fos.close();
        } catch (IOException e) 
        {
        
        }
        System.out.println(file.getName()+" has been written succesfully"); 
    }    
}
