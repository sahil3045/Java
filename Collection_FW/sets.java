package Collection_FW;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

        //Treeset sorts in natural order;
        Set<String> set2 = new TreeSet<String>();
        set2.add("sam");
        set2.add("Hardman");
        set2.add("Cat");
        
        ///////Iteration////
        for(String element: set1){
            System.out.println(element);
        }

        /// Does set contain any given item?
        if(set1.contains("Cat")){
            System.out.println("Contains Cat");
        }

        //Interscetion 
        //create a new duplicate set 
        Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //Difference
        Set<String> diff = new HashSet<String>(set1);
        diff.removeAll(set2);
        System.out.println(diff);
        

    }
    
}
