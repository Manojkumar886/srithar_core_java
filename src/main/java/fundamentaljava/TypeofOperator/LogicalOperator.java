package fundamentaljava.TypeofOperator;

public class LogicalOperator 
{
    public static void main(String[] args) 
    {
        float weight=67.89f;
        double height=167;

        String name="Manojkumar";

        String name1="Srithar";

        // && - Logical AND  ( T   T  == T)
        // || - Logical OR    (F   F == F)
        //  ! - Logical NOT    ( T =F , F =T)  opposite reaction 
        
        System.out.println((weight<=height)&&(name!=name1));
                                    // T     &&   T  ==T

        System.out.println((weight>=height)||(name!=name1));
        //                      F       ||      T   = T
        System.out.println(!(weight>=70));//true
    }
    
}
