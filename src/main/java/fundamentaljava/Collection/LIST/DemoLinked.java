package fundamentaljava.Collection.LIST;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinked 
{
    public static void main(String[] args)
    {
        LinkedList<String>  linked=new LinkedList<String>(); // generic
        linked.add("10");
        linked.add(" manojkumar");
        linked.addFirst("Sarathi");
        linked.add(2, "Murugan");


        // linked.remove();  //remove first element
        // linked.remove(2);

        // linked.set(0, "Srithar");//update your value

        // System.out.println(linked.get(2)); get a value with index

        // System.out.println(linked.getFirst());
        // linked.clear(); remove every elements

        // System.out.println(linked.indexOf("Murugan"));  calling object u ill get a index
        System.out.println(linked.contains("10"));

        // System.out.println(linked); 
        Iterator<String> it=linked.iterator();
        while (it.hasNext()) 
        {
        System.out.println(it.next()); 
        }

        

        
    }   
}
