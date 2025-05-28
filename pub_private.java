class Plant{
    String name;
    public final static int ID = 9; 
    private String type;
    protected String size;
    int height;
    public Plant(){
        this.name = "Sam";
        this.type = "plant";
        this.size = "medium";
        this.height = 8;
    }
}

/*
 * private--------only works in same class 
 * public---------works from anywhere
 * protected------subclass and subpackage
 * no modiefier----- same package only 
 */
public class pub_private {
    public static void main(String[] args) {
        Plant plant = new Plant();


        System.out.println(plant.name);


        System.out.println(plant.ID);

        //wont work as type is private.
        // System.out.println(plant.type);

        // works as plant is in same package as pub_private if it was in any other package then it wont work.
        System.out.println(plant.size);
         
    }
} 
