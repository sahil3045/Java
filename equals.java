class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person [id = " + id + ", name" + name + "]";
    }

    
}
public class equals {
    public static void main(String[] args) {
        Person person1 = new Person(2,  "Sam");
        Person person2 = new Person(3, "Fragile");
        //System.out.println(person1.equals(person2));

        Double value1 = 7.2;
        Double value2 = 7.3;       
        //System.out.println(value1.equals(value2));

        Integer num1 = 8;
        Integer num2 = 8;
        //System.out.println(num1.equals(num2));

        String name1 = "Sam";
        String name2 = "Fragile";
        System.out.println(name1.equals(name2));
    }

    
}
