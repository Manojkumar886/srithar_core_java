package fundamentaljava.ConsoleApplication;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@-annotation
@Data ///getter ,setter ,tostring
@NoArgsConstructor //default constructor
@AllArgsConstructor  //Para -cons
public class Studentdetails implements Comparable<Studentdetails>,Serializable
{
    private int Student_Regno;
    private String Student_Name;
    private String Student_Place;
    private int Student_Age;
    private long Student_Mobileno;
    private float Student_12thPercentage;
    private char Student_Gender;


    // public String toString()
    // {
    //     return " Studentdetails [ Regno"+Student_Regno+"Name"+Student_Name+" place "+Student_Place+" ]";
    // }


    // public void setStudent_Regno(int reg)
    // {
    //     Student_Regno=reg;
    // }

    // public int getStudent_Regno()
    // {
    //     return Student_Regno;
    // }

    @Override
    public int compareTo(Studentdetails o) {
        return o.getStudent_Name().compareTo(this.Student_Name);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
