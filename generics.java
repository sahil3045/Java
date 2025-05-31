import java.util.ArrayList;
public class generics {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Death Stranding");
        list.add("GTA V");
        list.add("Forza Horizon");

        String name = list.get(1);
        System.out.println(name);
    }
    
}
