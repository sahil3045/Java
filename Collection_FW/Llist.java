package Collection_FW;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Llist {
    private static void doTimings(String type, List<Integer> list){
         
    }
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();

        doTimings("ArrayList", arraylist);
        doTimings("LinkedList", linkedlist);

    }
    
}
