public class string_builder {
    public static void main(String[] args) {
        //Inefficient way  
        String info = "";
        info += "Hi I am Sam Bridges.";
        info += " ";
        info += "I am the main  character.";
        System.out.println(info);

        //More efficient
        StringBuilder sb = new StringBuilder("");
        sb.append("Hi I am Die Hardman.");
        sb.append(" ");
        sb.append("I am a side character.");
        System.out.println(sb);

        // System.out.println("Total cost  %-5d; Quantity is %d\n" 5, 120);
    }
    
}
