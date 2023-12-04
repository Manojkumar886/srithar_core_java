package fundamentaljava.StringClass;

public class DemoString 
{
    public static void main(String[] args) 
    {

        String trainer_name="MANOJKUMAR";  //literal
        
        char [] studname={ 'S','R','I','D','H','A','R'};
        String student_name=new String(studname);

        System.out.println(student_name);//SRIDHAR

        String lastname="SARATHI";
        // CONTAINS()
        //IMMUTABLE
        student_name.concat(lastname);  //SRITHAR
        System.out.println(student_name);
        student_name=student_name.concat(lastname);  //SRITHARSARATHI 
        System.out.println(student_name);

        // CHARAT()
        System.out.println(trainer_name.charAt(5));  //K

        // EQUAL and EQUALIGNORECASE (based on alphabeticalletters)
        String firstname="sarathi";
        System.out.println(firstname.equals(lastname));//false
        System.out.println(firstname.equalsIgnoreCase(lastname));//true
        
        // COMPARETO and COMPARETOIGONRECASE(based on asci numbers)

        System.out.println(firstname.compareTo(lastname));  //ex: 96 - 67  =-29
        System.out.println(firstname.compareToIgnoreCase(lastname));   //ex:78-78  =0 

        // SUBSTRING(get a value in between number)

        System.out.println(student_name.substring(6));
        System.out.println(student_name.substring(5,11));

        //uppercase ,lowercase (changing values)
        System.out.println(firstname.toUpperCase());
        System.out.println(lastname.toLowerCase());

        // replace
        String content="Java String replace(char old, char new) method example";

        content=content.replace('a', 'i');
        System.out.println(content);

        // contains -The Java String class contains() method searches the sequence of characters in this string.
        //  It returns true if the sequence of char values is found in this string otherwise returns false.

        System.out.println(content.contains("Jivi")); //true

        




        
    }
    
}
