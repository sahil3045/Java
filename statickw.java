class Thing{
    // now as final is used it cannot be changed further.
    public final static int LUCKY_NUMBER = 7;
    public String name;
    public static String Description;

    public static int count = 0;
    public int id;

    public Thing(){
        id = count;
        count++;
    }

    public void showname(){
        
        System.out.println("object id: " + id + " name is: " + name);
    }

    public static void showinfo(){
        // only static data can be used in this void as it is static.
        System.out.println(Description);
    }

     
}
public class statickw {
    public static void main(String[] args) {
        System.out.println("Before creating objects count is: " + Thing.count);
        Thing.Description = "I am a thing.";
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        Thing.showinfo();
        System.out.println("After  creating objects count is: " + Thing.count);

        thing1.name = "Sam";
        thing2.name = "Bridges";
 
        System.out.println(thing1.name);
        System.out.println(thing2.name);

        thing1.showname();
        thing2.showname();
        // pi is a static constant which is previously defined. 
        System.out.println(Math.PI);

        System.out.println(Thing.LUCKY_NUMBER);
    }
}
