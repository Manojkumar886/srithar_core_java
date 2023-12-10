package fundamentaljava.ConsoleApplication;


import java.util.Arrays;
import java.util.Scanner;

public class StudentBioData extends Studentdetails implements StudentdetailsFunctions,Runnable
{
    synchronized public void run()
    {
        System.out.println(" current Thread Name /Id / Priority"+Thread.currentThread().getName()+"/"+Thread.currentThread().getId()+"/"+Thread.currentThread().getPriority());
        StudentBioData bio=new StudentBioData();
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
    static Scanner scan=new Scanner(System.in);
    Studentdetails []studentinformartion=new Studentdetails[4];

    public StudentBioData()
    {
        studentinformartion[0]=new Studentdetails(1001,"Manoj","Elachipalayam",23,9789355930l,89.87f,'M');
        studentinformartion[1]=new Studentdetails(1002,"Srithar","Salem",21,9944965787l,85.7f,'M');
        studentinformartion[2]=new Studentdetails(1003,"Haritha","Pondi",21,8978676776l,9.3f,'F');
        studentinformartion[3]=new Studentdetails(1004,"Pavithra","Namakkal",24,9500897867l,98.87f,'F');
    }
    static
    {
        System.out.println(" Welcome to Goverment Higher Secondary School -Elachipalayam \n");    
    }

    @Override
    public String Newstudentdetails(Studentdetails studentinfo)
    {
        try
        {
            for(int index=0;index<studentinformartion.length;index++)
            {
                if(studentinformartion[index]==null)
                {
                    studentinformartion[index]=studentinfo;
                    return studentinfo.getStudent_Name()+" has been added successfully";
                }
            }
            throw new StudentdetailsException();
        }
        catch(StudentdetailsException sde)
        {
            System.out.println(sde+" memory is full,suppose if you want to free space in your  memory any one value is delete:");
            for(Studentdetails std: studentinformartion)
            {
                System.out.println(std);
            }
            System.out.println(" which one value you want delete :");
            int regno1=scan.nextInt();
            Deletestudentdetails(regno1);
            Newstudentdetails(studentinfo);
        }
        return studentinfo.getStudent_Name()+" has been added successfully";

    }

    @Override
    public void Listallstudentdetails()
    {
        for(Studentdetails stud : studentinformartion)
        {
            System.out.println(stud);
        }
    }

    @Override
    public void Updatestudentdetails(int student_regno)
    {
        for(int i=0;i<studentinformartion.length;i++)
        {
            if(studentinformartion[i].getStudent_Regno()==student_regno)
            {
                System.out.println(studentinformartion[i]+" which field you want to update in your profile");
                System.out.println("\n 1.name\n2.place\n3.age\n4.contact\n5.percentage\n6.gender");
                int execute=scan.nextInt();
                switch (execute) {
                    case 1:
                        System.out.println(" please enter your new name");
                        String newname=scan.next();
                        studentinformartion[i].setStudent_Name(newname);
                        System.out.println(student_regno+" your name is updated successfully");
                        break;
                    case 4:
                        System.out.println(" please enter your new mobile no");
                        long new_mobile=scan.nextLong();
                        studentinformartion[i].setStudent_Mobileno(new_mobile);
                        System.out.println(student_regno+" your mobile no is updated successfully");
                        break;
                    default:
                        return;
                }
                return ;
            }
        }
    }

    @Override
    public void Deletestudentdetails(int student_regno)
    {
        try
        {
            for(int i=0;i<studentinformartion.length;i++)
            {
                if(studentinformartion[i].getStudent_Regno()==student_regno)
                {
                   studentinformartion[i]=null;
                    System.out.println(student_regno+" has been deleted...!");
                    return;
                }
            }
            throw new StudentdetailsException();
        }
        catch(StudentdetailsException sde)
        {
            System.out.println(sde+" your regno is wrong ,please choose below the any numbers");
            for(int i=0;i<studentinformartion.length;i++)
            {
                System.out.println(studentinformartion[i].getStudent_Regno());
            }
            System.out.println(" enter your regno :");
            Deletestudentdetails(scan.nextInt());
        }

    }

    public void FindIndex(long mobile_no)
    {
        int i;
        for( i=0;i<studentinformartion.length;i++)
        {
            if(studentinformartion[i].getStudent_Mobileno()==mobile_no)
            {
                System.out.println("your value is founded @"+i+"\n"+studentinformartion[i]);
                return;
            }
        }
    }


    public void Sortstudentdetails()
    {
        // Arrays.sort(studentinformartion);
        // System.out.println(Arrays.toString(studentinformartion));

        Studentdetails student=null;

        System.out.println("which field you want sort :");
        String field=scan.next();
        for(int index=0;index<studentinformartion.length;index++)
        {
            for(int i=index+1;i<studentinformartion.length;i++)
            {
                if(field.equalsIgnoreCase("studentname"))
                {
                    System.out.println(studentinformartion[index].getStudent_Name());
                    if(studentinformartion[index].getStudent_Name().compareTo(studentinformartion[i].getStudent_Name())>0)
                    {
                        student=studentinformartion[index];
                        studentinformartion[index]=studentinformartion[i];
                        studentinformartion[i]=student;
                    }
                }
                else if( field.equalsIgnoreCase("percentage"))
                {
                    if(studentinformartion[index].getStudent_12thPercentage()>=studentinformartion[i].getStudent_12thPercentage())
                    {
                        student=studentinformartion[index];
                        studentinformartion[index]=studentinformartion[i];
                        studentinformartion[i]=student;
                    }
                }
                else
                {
                    System.out.println(" your field could't matching....!");
                }
            }
        }
    }
}
