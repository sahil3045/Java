class Person {
    int age;
    String name;

    void speak(){
        System.out.println("My name is: " + name);
    }

    int calculateyearstillretirement(){
        int yearsleft = 50 - age;
        return yearsleft;
    }

    int getage (){
        return age;
    }

    String getname(){
        return name;
    }
}

public class Get_return {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Manas";
        person1.age = 16;

        int years = person1.calculateyearstillretirement();
        System.out.println("Years till retirement: " + years );
        
        int age = person1.getage();
        System.out.println("My age is: " + age );

        String name = person1.getname();
        System.out.println("my Name is: " + name);


    }
     
}
