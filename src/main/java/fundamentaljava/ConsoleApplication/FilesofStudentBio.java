package fundamentaljava.ConsoleApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import javax.management.ObjectInstance;

public class FilesofStudentBio extends Studentdetails implements Runnable,StudentdetailsFunctions
{
    static Scanner scan=new Scanner(System.in);
    // LinkedList<Studentdetails> std=new LinkedList<>();
    // public FilesofStudentBio() 
    // {
    //     File file=new File("D:\\SritharFiles\\ConsoleMemory.doc");
    //     // try {
    //     //     file.createNewFile();
    //     // } catch (IOException e) {
    //     //     // TODO Auto-generated catch block
    //     //     e.printStackTrace();
    //     // }
    //     try {
    //         FileOutputStream fos=new FileOutputStream(file);
    //         ObjectOutputStream oos=new ObjectOutputStream(fos);
    //         std.add(new Studentdetails(1001,"Manoj","Elachipalayam",23,9789355930l,89.87f,'M'));
    //         oos.writeObject(std);
    //         oos.close();
    //         fos.close();
    //     } catch (IOException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }
    // }
    File file=new File("D:\\SritharFiles\\ConsoleMemory.doc");
    LinkedList<Studentdetails> std=null;
    public void write() throws IOException
    {
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(std);
        oos.close();
        fos.close();
    }

    public void read() throws IOException,ClassNotFoundException
    {
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);

        std=(LinkedList<Studentdetails>) ois.readObject();
        
        ois.close();
        fis.close();
    }
    
    @Override
    public String Newstudentdetails(Studentdetails studentinfo) 
    {
        try
        {
            read();
            std.add(studentinfo);
            write();
        }
        catch(IOException io)
        {

        }
        catch(ClassNotFoundException cn)
        {

        }
       return "";
    }

    @Override
    public void Listallstudentdetails() 
    {
        try{
            read();
            Iterator i=std.iterator();
            while(i.hasNext())
            {
                System.out.println(i.next());
            }
        }
        catch(IOException io)
        {

        }
        catch(ClassNotFoundException cn)
        {

        }

        
    }

    @Override
    public void Updatestudentdetails(int student_regno)
    {
        
    }

    @Override
    public void Deletestudentdetails(int student_regno) 
    {
        try {
            read();
            for(int i=0;i<std.size();i++)
            {
                if(std.get(i).getStudent_Regno()==student_regno)
            {
                std.remove(i);
                write();
                 System.out.println(student_regno+" has been deleted successfully");
                break;
            }
          }
        } 
        catch (ClassNotFoundException | IOException e)
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void FindIndex(long mobile_no) 
    {
        try {
            read();
            for(int i=0;i<std.size();i++)
            {
                if(std.get(i).getStudent_Mobileno()==mobile_no)
                {
                    System.out.println(" your value is founded at"+i+" with values "+std.get(i));
                    return;
                }
                System.out.println(" not  matching in my object ");
            } 
        } 
        catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void Sortstudentdetails() 
    {
      try {
        read();
        Collections.sort(std);
        write();
    } catch (ClassNotFoundException | IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
      
    }

    @Override
    synchronized  public void run() 
    {
        System.out.println(" current Thread Name /Id / Priority"+Thread.currentThread().getName()+"/"+Thread.currentThread().getId()+"/"+Thread.currentThread().getPriority());
        FilesofStudentBio bio=new FilesofStudentBio();
        
        do
        {
            System.out.println("------student registration section----\n");
            System.out.println("please choose any one \n 1.ADD \n 2.LIST \n 3.UPDATE \n 4.SEARCH \n 5.SORT \n 6.DELETE \n 7.EXIT \n");
            int process=scan.nextInt();
            switch (process)
            {
                case 1:
                    System.out.println(" Add your details regno,name,place,age,mobileno,percentage,gender\n");
                    Studentdetails student1=new Studentdetails(scan.nextInt(), scan.next(),scan.next(),scan.nextInt(),scan.nextLong(),scan.nextFloat(),scan.next().charAt(0));
                    System.out.println(bio.Newstudentdetails(student1));
                    break;
                case 2:
                    System.out.println("list all student details \n");
                    bio.Listallstudentdetails();
                    break;
                case 3:
                    System.out.println(" you are choose to update your profile ...");
                    System.out.println(" please tell us your update reg_no");
                    int reg=scan.nextInt();
                    bio.Updatestudentdetails(reg);
                    break;
                case 4:
                    System.out.println(" which value of index you want");
                    System.out.println(" please enter your mobile no");
                    long contact=scan.nextLong();
                    bio.FindIndex(contact);
                    break;
                case 5:
                    System.out.println(" Sorted Your Values :");
                    bio.Sortstudentdetails();
                    break;
                case 6:
                    System.out.println(" which reg no is delete in your studentbiodata");
                    int reg_no=scan.nextInt();
                    bio.Deletestudentdetails(reg_no);
                    break;
                case 7:
                    return;
                default:
                    return;
            }
        }
        while (true);

    }
      
}
