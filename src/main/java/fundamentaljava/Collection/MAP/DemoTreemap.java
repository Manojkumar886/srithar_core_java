package fundamentaljava.Collection.MAP;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreemap 
{
    public static void main(String[] args) 
    {
        TreeMap<String,Tiles> object=new TreeMap<>();
        Tiles t1=new Tiles("Kajaria Ceramics Ltd","Floor_tile",4,98.8f);
        Tiles t2=new Tiles("HSIL Hindware.", "Kitchen Tile", 12,45.5f );
        Tiles t3=new Tiles("Orientbell Tiles","Bathroom_Tile",800,9000.5f);

        object.put("Manoj", t3);
        object.put("Srithar", t1);
        object.put("Pavithra", t2);
        object.put("Geetha", t3);
        object.put("Haritha", t2);

        for(Map.Entry obj: object.entrySet())
        {
            System.out.println("Customer name :"+obj.getKey());
            System.out.println("Tiles Details :"+obj.getValue());
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