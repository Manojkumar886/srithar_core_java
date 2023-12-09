package fundamentaljava.Exception;

public class InvalidAgeException extends Exception
{   
    public InvalidAgeException()
    {
        super(" Your age is below 18");
    }
}
