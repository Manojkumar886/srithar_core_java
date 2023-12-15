package fundamentaljava.Collection.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class DemoVectotArray 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> alvl=new ArrayList<Integer>();
        alvl.add(89);
        alvl.add(67);
        alvl.add(67);
        alvl.add(45);
        alvl.add(90);

        Vector vlal=new Vector<>();

        vlal.add(" Manojkumar");
        vlal.add('D');
        vlal.add(89);
        vlal.add(13);
        vlal.add(34);
        vlal.add(45);



        vlal.addAll(alvl);

        // vlal.removeAll(alvl);  // delete duplicates values......show only original values
        vlal.retainAll(alvl); // delete original values ...show only duplicates values 
        System.out.println("VECTOR list values :");
        Iterator it=vlal.iterator();

        for(  ;it.hasNext();  )
        {
            System.out.println(it.next());
        }
        System.out.println("Array list values :");
         Iterator its=alvl.iterator();

        for(  ;its.hasNext();  )
        {
            System.out.println(its.next());
        }

    }    
}
