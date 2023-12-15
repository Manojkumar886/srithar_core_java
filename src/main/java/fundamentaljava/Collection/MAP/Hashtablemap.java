package fundamentaljava.Collection.MAP;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Hashtablemap 
{
    public static void main(String[] args) 
    {
        Hashtable<String,Integer> object=new Hashtable<>();
        
        object.put("Manojkumar", 22);
        object.put("Sridhar", 21);
        object.put("Pavithra", 24);
        object.put("haritha", 21);
        object.put("Geetha", 48);

        HashMap<String,Integer>  object1=new HashMap<>();
        object1.putAll(object);

        System.out.println(" hashtable values :"+object);
        System.out.println();
        System.out.println("Hashmap"+object1);      

        // Scanner scan=new Scanner(System.in);
        // int a=scan.nextInt();
        // int b=scan.nextInt();
        // float ab=a/b;
        // System.out.println(ab);
    }    
}
