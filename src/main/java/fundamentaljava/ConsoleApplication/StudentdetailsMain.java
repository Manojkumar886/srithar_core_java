package fundamentaljava.ConsoleApplication;

import java.io.IOException;

public class StudentdetailsMain 
{
    public static void main(String[] args)  throws IOException
    {
        // CollectionStudentBio bio=new CollectionStudentBio();
        
        FilesofStudentBio bio=new FilesofStudentBio();
        Thread th1=new Thread(bio,"Manojkumar");
        Thread th2=new Thread(bio,"Sridhar");
        Thread th3=new Thread(bio,"Peacock");

        th1.start();
        th2.start();
        th3.start();
    }    
}
