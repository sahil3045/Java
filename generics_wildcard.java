import java.util.ArrayList;
class Machine{
    public String toString(){
        return "I am a Machine";
    }
}


public class generics_wildcard {
    public static void main(String[] args) {
        ArrayList<Machine> list = new ArrayList<Machine>();
        list.add(new Machine());
        list.add(new Machine());

    
        public static void showList(ArrayList<Machine> list) {
            for(String value : list){
                System.out.println(value);
            }
        }
        showList(list);

    }
}
