package fundamentaljava.Collection.SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class DemoHashset 
{
    public static void main(String[] args)
    {
        // HashSet hs=new HashSet();
        // hs.add("Manoj");
        // hs.add(566877768);
        // hs.add("Lake");
        // hs.add("Sarathi");
        // hs.add("Manoj");
        // hs.add(null);

        // System.out.println(hs);
        
        // hs.remove("lake");
        // hs.clear();//removeall

        TreeSet<Tiles> object=new TreeSet<>();
        Tiles t1=new Tiles("Kajaria Ceramics Ltd","Floor_tile",4,98.8f);
        object.add(new Tiles("HSIL Hindware.", "Kitchen Tile", 12,45.5f ));
        object.add(t1);
        object.add( new Tiles("Orientbell Tiles","Bathroom_Tile",800,9000.5f));
        // object.add(null);
        Iterator<Tiles> it=object.iterator();

        while (it.hasNext()) 
        {
            System.out.println(it.next());    
        }
    }
}


class Tiles implements Comparable<Tiles>
{
    String Tiles_brand;
    String Tiles_Type;
    int Tiles_Squarefeet;
    float Tiles_Price;

    @Override
    public String toString() {
        return "Tiles [Tiles_brand=" + Tiles_brand + ", Tiles_Type=" + Tiles_Type + ", Tiles_Squarefeet="
                + Tiles_Squarefeet + ", Tiles_Price=" + Tiles_Price + "]";
    }

    public Tiles(String tiles_brand, String tiles_Type, int tiles_Squarefeet, float tiles_Price) {
        Tiles_brand = tiles_brand;
        Tiles_Type = tiles_Type;
        Tiles_Squarefeet = tiles_Squarefeet;
        Tiles_Price = tiles_Price;
    }

    @Override
    public int compareTo(Tiles o) 
    {
        return o.Tiles_Type.compareTo(this.Tiles_Type);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }



}