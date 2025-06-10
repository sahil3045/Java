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
        //for(int i = 0; i<1E5; i++){
        //    list.add(0, i);
        //}
         
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end-start) + " ms for " + type );
    }
    public static void main(String[] args) {
        // arraylist handles arrays internally 
        //[0][1][2][3][4][5]......
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        //Linked list consists of elements where each element has a reference to the previous and next element
        //[0]->[1]->[2]->[3].........
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();

        doTimings("ArrayList", arraylist);
        doTimings("LinkedList", linkedlist);

    }
    
    
}
