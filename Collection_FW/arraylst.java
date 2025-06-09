package Collection_FW;
import java.util.ArrayList;
import java.util.List;

public class arraylst {
    public static void main(String[] args) {
        ArrayList<Integer> nos = new ArrayList<Integer>(500);
        nos.add(10);
        nos.add(35);
        nos.add(22);
        System.out.println(nos.get(2));

        //removing numbers (Careful!)
        nos.remove(nos.size() -1);

        //remove nos(slow)
        nos.remove(0);

        System.out.println("\nIteration #1: ");
        for(int i=0; i<nos.size(); i++){
            System.out.println(nos.get(i));
        }

        System.out.println("\nIteration #2: ");
        for(Integer value: nos){
            System.out.println(value);
        }
        // list interface..
        List<String> values= new ArrayList<String>();
        values.add("Sam");

    }

}
