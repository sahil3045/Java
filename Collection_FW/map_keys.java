package Collection_FW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Person {
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id + ": " + name;
    }
}

public class map_keys {
    public static void main(String[] args) {

        Person p1 = new Person(1, "Sam");
        Person p2 = new Person(2, "Fragile");
        Person p3 = new Person(3, "Hardman");
        
    
        Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
        map.put(p1, 3);
        map.put(p2, 4);
        map.put(p3, 8);

        for(Person key:map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }

        Set<Person> set = new HashSet<Person>();
        set.add(p1);
        set.add(p2);
        set.add(p3);

    }
    
}
