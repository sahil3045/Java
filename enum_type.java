
public class enum_type {
    public static final int DOG = 1;
    public static final int CAT = 4;
    public static final int MOUSE = 5;
    public static void main(String[] args) {
        Animal animal = new Animal.DOG;
        switch (animal){
            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;

        }
        System.out.println(Animal.DOG);
    }
}
