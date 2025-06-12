package Collection_FW;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        //Hashset does not remember order in which items are added
    
        Set<String> set1 = new HashSet<String>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Mouse");

        //adding dubplicate ietms has no effect 
        set1.add("Mouse");
        System.out.println(set1);

         //Linkedhashset remembers the order you added the items in
        Set<String> lset = new LinkedHashSet<String>();
        lset.add("Sam");
        lset.add("Porter");
        lset.add("Bridges");
        System.out.println(lset);


    }
    
}
