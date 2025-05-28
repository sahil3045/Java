package polymorphism;

public class app {
    public static void main(String[] args) {
        
    
    Plant plant = new Plant();
    Tree tree = new Tree();

    Plant plant2 = tree;

    //wont work
    //plant2.grow();
    }
    
}
