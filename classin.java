class Person{
    // instance (data or state)
    String name;
    int age;

    // classes can contain 
    //1) data 
    //2) subroutines(methods)
}
public class classin {
    public static void main(String[] args) {
        Person person1 = new Person();
    person1.name = "Manas";
    person1.age = 16; 

    Person person2 = new Person();
    person2.name = "Sahil"; 
    person2.age = 20;

    System.out.println(person1.name);
    }

    
}
