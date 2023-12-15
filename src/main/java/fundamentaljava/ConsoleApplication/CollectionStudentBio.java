package fundamentaljava.ConsoleApplication;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectionStudentBio extends Studentdetails implements Runnable,StudentdetailsFunctions
{
    public CollectionStudentBio()
    {
        std.add( new Studentdetails(1001,"Manoj","Elachipalayam",23,9789355930l,89.87f,'M'));
        std.add(new Studentdetails(1002,"Srithar","Salem",21,9944965787l,85.7f,'M'));
        std.add(new Studentdetails(1003,"Haritha","Pondi",21,8978676776l,9.3f,'F'));
        std.add(new Studentdetails(1004,"Pavithra","Namakkal",24,9500897867l,98.87f,'F'));
    }
    static Scanner scan=new Scanner(System.in);

    LinkedList<Studentdetails> std=new LinkedList<>();

    synchronized public void run()
    {
        System.out.println(" current Thread Name /Id / Priority"+Thread.currentThread().getName()+"/"+Thread.currentThread().getId()+"/"+Thread.currentThread().getPriority());
        CollectionStudentBio bio=new CollectionStudentBio();
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

     @Override
    public void Deletestudentdetails(int student_regno)
     {
       for(int i=0;i<std.size();i++)
       {
        if(std.get(i).getStudent_Regno()==student_regno)
        {
            std.remove(i); 
            break;
        }
       }
        
    }
    @Override
    public void FindIndex(long mobile_no) 
    {
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
    @Override
    public void Listallstudentdetails() 
    {
        Iterator it=std.iterator();
        while (it.hasNext()) 
        {
            System.out.println(it.next());    
        }
    }
    @Override
    public String Newstudentdetails(Studentdetails studentinfo)
     {
        std.add(studentinfo);
        return studentinfo.getStudent_Name()+" has been added successfully";
    }
    @Override
    public void Sortstudentdetails() 
    {      
       Collections.sort(std);
       
       for(Studentdetails std1: std)
       {
        System.out.println(std1);
       }
    }
    @Override
    public void Updatestudentdetails(int student_regno)
    {
        for(int i=0;i<std.size();i++)
        {
            if(std.get(i).getStudent_Regno()==student_regno)
            {
                System.out.println(" which field you want update ");
                 System.out.println("please select any one 1. regno,2.name,3.place,4.age,5.mobileno,6.percentage,7.gender\n");
                 int field=scan.nextInt();
                 switch(field)
                 {
                    case 1: 
                    System.out.println(" you  choose update your regno");
                    System.out.println(" enter your registration no");
                    int newreg=scan.nextInt();
                    std.get(i).setStudent_Regno(newreg);
                    System.out.println(" your registration no is updated successfully");
                    break;
                    case 2:
                    System.out.println(" you  choose update your name");
                    System.out.println(" enter your new name");
                    String newname=scan.next();
                    std.get(i).setStudent_Name(newname);
                    System.out.println(" your name  is updated successfully");
                    break;
                 }
                
            }
        }        
    }
}
