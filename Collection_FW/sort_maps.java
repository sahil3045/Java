package Collection_FW;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;


class Temp{

}

public class sort_maps {
    public static void testmap(Map<Integer, String> map){
        map.put(9, "Nine"); 
        map.put(8,"Eight");
        map.put(7, "Seven");
        map.put(6,"Six");

        for(Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println("Key " + ": " + value);

        }
    }
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        // linked hashmap uses double linkedlist.
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treehashmap = new TreeMap<Integer, String>();

        System.out.println(new Temp());

        testmap(hashmap);
    }
    
}
