class Frog{
    String name;
    int age;

    public void getname(String name){
        this.name = name;
    }

    public void getage(int age){
        this.age = age;
    }

    void setname(String newname){
        name = newname;
    }

    void setage(int newage){
        age = newage;
    }
}
public class set_this {
    public static void main(String[] args) {
        Frog frog1 = new Frog();
        frog1.name = "Hero";
        frog1.age = 12;

        frog1.setname("Villain");
        //System.out.println(frog1.setname());
    }
    
}
