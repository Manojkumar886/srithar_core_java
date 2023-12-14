package fundamentaljava.Collection.LIST;

import java.util.Iterator;
import java.util.Stack;

public class DemoStack 
{
    public static void main(String[] args) 
    {
        // stack index start @ 1 
        //  other classes index start @ 0
        Stack  filo=new Stack<>();  //non-generic

        filo.push(" Manojkumar");
        filo.push(23);
        filo.push(89.9f);
        filo.push(28736723687283787l);
        filo.push('M'); //last element

        filo.pop();// only delete at last element only..!

        System.out.println(" my object peek value is :"+filo.peek());

        System.out.println(filo.search(23));  // start at 1 and calculate in last value...

        System.out.println(filo.empty());  // output will get a boolean(true or false)
        Iterator it=filo.iterator();
        do{
            System.out.println(it.next());
        }while(it.hasNext());
        
    }    
}
