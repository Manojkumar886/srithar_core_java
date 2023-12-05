package fundamentaljava.ConsoleApplication;


import java.util.Scanner;

public class StudentBioData  extends Studentdetails implements StudentdetailsFunctions
{

    static Scanner scan=new Scanner(System.in);
    Studentdetails []studentinformartion=new Studentdetails[7];

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

    public static void main(String[] args)
    {
        StudentBioData bio=new StudentBioData();
        do
        {
            System.out.println("------student registration section----\n");
            System.out.println("please choose any one \n 1.ADD \n 2.LIST \n 3.UPDATE \n 4.SEARCH \n 5.SORT \n 6.DELETE \n");
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
                default:
                    return;
            }
        }
        while (true);
    }

    @Override
    public String Newstudentdetails(Studentdetails studentinfo)
    {
        for(int index=0;index<studentinformartion.length;index++)
        {
            if(studentinformartion[index]==null)
            {
                studentinformartion[index]=studentinfo;
                break;
            }
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

    }

    @Override
    public void Deletestudentdetails(int student_regno)
    {

    }

    public int FindIndex(long mobile_no)
    {
        return 0;
    }


    public void Sortstudentdetails(float percentage)
    {

    }
}
