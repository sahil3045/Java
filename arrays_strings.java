public class arrays_strings {
    public static void main(String[] args) {
        String words[] = new String[3];

        words[0] = "How";
        words[1] = "Are";
        words[2] = "You";

        System.out.println(words[2]);

        String[] fruits = {"Apple", "Banana", "Kiwi", "Guava"};
        for(String fruit:  fruits){
            System.out.println(fruit);
        }
    }
    
}
