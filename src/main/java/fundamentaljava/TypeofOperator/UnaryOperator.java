package fundamentaljava.TypeofOperator;

public class UnaryOperator 
{
    public static void main(String[] args) 
    {
        // Increment(++) ,Decrement (--),Negation (-)

        // post incre(p++)/decre(p--)  -pre incre(++p)/decre(p--)

        int mousePrice=430;
        float mouse_cost=mousePrice;

        System.out.println(++mouse_cost);//431
        System.out.println(mouse_cost++);//431 it will change this line but show in nextline
        System.out.println(mouse_cost);//432

        System.out.println(--mouse_cost);//431.0
        System.out.println(mouse_cost--);//431.0
        System.out.println(mouse_cost);//430


    
    }     

}
