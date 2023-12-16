package fundamentaljava.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectWriting 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        // File Creation with object of Execution(writing)

        // File file=new File("D:\\SritharFiles\\objectFile.txt");
        // // file.createNewFile();
        // FileOutputStream fos=new FileOutputStream(file);
        // ObjectOutputStream oos=new ObjectOutputStream(fos);

        // MasalaItems item1=new MasalaItems("Aachi", "Chilly powder", 18, 100, "Pocket");

        // oos.writeObject(item1);

        // oos.close();
        // fos.close();

        File file=new File("D:\\SritharFiles\\objectFile.txt");

        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);

        MasalaItems m1=(MasalaItems) ois.readObject();
        System.out.println(m1.masala_brand);
        System.out.println(m1.masala_name);
        System.out.println(m1.masala_packingtype);
        System.out.println(m1.masala_price);
        System.out.println(m1.masala_quantity);

        fis.close();
        ois.close();
    }    
}

class MasalaItems implements Serializable
{
    String masala_brand;
    String masala_name;
    int masala_price;
    int masala_quantity;
    String masala_packingtype;
    
    @Override
    public String toString() {
        return "MasalaItems [masala_brand=" + masala_brand + ", masala_name=" + masala_name + ", masala_price="
                + masala_price + ", masala_quantity=" + masala_quantity + ", masala_packingtype=" + masala_packingtype
                + "]";
    }

    public MasalaItems(String masala_brand, String masala_name, int masala_price, int masala_quantity,
            String masala_packingtype) {
        this.masala_brand = masala_brand;
        this.masala_name = masala_name;
        this.masala_price = masala_price;
        this.masala_quantity = masala_quantity;
        this.masala_packingtype = masala_packingtype;
    }

}
