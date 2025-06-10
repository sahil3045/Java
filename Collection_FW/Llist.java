package Collection_FW;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Llist {
    private static void doTimings(String type, List<Integer> list){
         for(int i = 0; i < 1E5; i++){
            list.add(i);
        }
         
    
        long start = System.currentTimeMillis();
        /*
        // add items at end of list 
        for(int i = 0; i <1E5; i++){
            list.add(i);
        }
        */
        /*
         * add items elsewhere in the list 
         */
        for(int i = 0; i<1E5; i++){
            list.add(0, i);
        }
         
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end-start) + " ms for " + type );
    }
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();

        doTimings("ArrayList", arraylist);
        doTimings("LinkedList", linkedlist);

    }
    
    
}
