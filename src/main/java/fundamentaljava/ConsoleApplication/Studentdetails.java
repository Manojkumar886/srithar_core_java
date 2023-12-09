package fundamentaljava.ConsoleApplication;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@-annotation
@Data ///getter ,setter ,tostring
@NoArgsConstructor //default constructor
@AllArgsConstructor  //Para -cons
public class Studentdetails
{
    private int Student_Regno;
    private String Student_Name;
    private String Student_Place;
    private int Student_Age;
    private long Student_Mobileno;
    private float Student_12thPercentage;
    private char Student_Gender;


    public void setStudent_Regno(int reg)
    {
        Student_Regno=reg;
    }

    public int getStudent_Regno()
    {
        return Student_Regno;
    }
}
