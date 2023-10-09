package fundamentaljava;

public class RelationOperator 
{
    public static void main(String[] args) 
    {
        // ==   !=  >   <   >=  <=
        String my_fav_state_name="Kerala";
        String my_nearest_state_name="Kerala";
        String my_state_name="Tamilnadu";

        System.out.println(my_fav_state_name == my_nearest_state_name);//==
        int litre=20;
        int km=400;
        System.out.println(km >= litre*20);//true

        System.out.println(my_nearest_state_name != my_fav_state_name);//false
        
        char myinitial='z';//122

        int asci=122;

        System.out.println(myinitial<asci);//122<122//false
        
    }    
}
