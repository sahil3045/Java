package Collection_FW;
import java.util.HashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Mouse");

        //adding dubplicate ietms has no effect 
        set1.add("Mouse");

        System.out.println(set1);


    }
    
}
